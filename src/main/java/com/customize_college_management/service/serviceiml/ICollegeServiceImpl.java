package com.customize_college_management.service.serviceiml;

import com.customize_college_management.dto.CollegeDto;
import com.customize_college_management.dto.CrDto;
import com.customize_college_management.dto.FacultyDto;
import com.customize_college_management.dto.FloorDto;
import com.customize_college_management.entity.*;
import com.customize_college_management.repository.CRRepository;
import com.customize_college_management.repository.CollegeRepository;
import com.customize_college_management.repository.FacultyRepository;
import com.customize_college_management.repository.FloorRepository;
import com.customize_college_management.service.CollegeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ICollegeServiceImpl implements CollegeService {

    private final CollegeRepository collegeRepository;
    private final FloorRepository floorRepository;
    private final FacultyRepository facultyRepository;
    private final CRRepository crRepository;

    @Override
    @Transactional
    public void registerCollege(CollegeDto collegeDto) {
        College college = new College();
        college.setCollegeName(collegeDto.getCollegeName());

        College savedCollege = collegeRepository.save(college);

        List<Floor> floors = new ArrayList<>();
        for (FloorDto floorDto : collegeDto.getFloors()) {
            Floor floor = new Floor();
            floor.setFloorName(floorDto.getFloorName());
            floor.setCollege(savedCollege);
            generateRoomNames(floor, floorDto, savedCollege);
            floors.add(floor);
            floorRepository.save(floor);
        }

        savedCollege.setNoOfFloors(floors);

        List<Faculty> faculties = new ArrayList<>();
        for (FacultyDto facultyDto : collegeDto.getFaculties()) {
            Faculty faculty = new Faculty();
            faculty.setFacultyName(facultyDto.getName());
            faculty.setEmail(facultyDto.getEmail());
            faculty.setMobileNumber(facultyDto.getMobileNumber());
            faculty.setCollege(savedCollege);
            faculties.add(faculty);
            facultyRepository.save(faculty);
        }

        savedCollege.setFaculties(faculties);

        List<CR> crs = new ArrayList<>();
        for (CrDto crDto : collegeDto.getCrs()) {
            Faculty coordinator = facultyRepository.findByEmail(crDto.getCoordinatorEmail());
            if (coordinator == null) {
                throw new IllegalArgumentException("Coordinator not found with email: " + crDto.getCoordinatorEmail());
            }

            CR cr = new CR();
            cr.setStudentName(crDto.getCrName());
            cr.setRollNo(crDto.getRollNo());
            cr.setMobileNumber(crDto.getMobileNumber());
            cr.setStudentEmail(crDto.getEmail());
            cr.setCo_ordinator(coordinator);
            cr.setCollege(savedCollege);
            crs.add(cr);
            crRepository.save(cr);
        }
        savedCollege.setCrs(crs);
        collegeRepository.save(savedCollege);
    }

    private void generateRoomNames(Floor floor, FloorDto floorDto, College college) {
        String floorName = floorDto.getFloorName();
        int classRoomCount = floorDto.getNoOfClassRooms();
        int labCount = floorDto.getNoOfLabs();
        int auditoriumCount = floorDto.getNoOfAuditarium();
        int otherRoomCount = floorDto.getNoOfOtherRooms();

        for (int i = 1; i <= classRoomCount; i++) {
            String className = floorName + "C" + i;
            Classroom classroom = new Classroom(className, floor);
            classroom.setCollege(college);
            floor.addClassRooms(classroom);
        }

        for (int i = 1; i <= labCount; i++) {
            String labName = floorName + "LAB" + i;
            Lab lab = new Lab(labName, floor);
            lab.setCollege(college);
            floor.addLabs(lab);
        }

        for (int i = 1; i <= auditoriumCount; i++) {
            String auditoriumName = floorName + "AUD" + i;
            Auditorium auditorium = new Auditorium(auditoriumName, floor);
            auditorium.setCollege(college);
            floor.addAudi(auditorium);
        }

        for (int i = 1; i <= otherRoomCount; i++) {
            String otherRoomName = floorName + "O" + i;
            OtherRoom otherRoom = new OtherRoom(otherRoomName, floor);
            otherRoom.setCollege(college);
            floor.addOtherRooms(otherRoom);
        }

    }

    public void addSampleData() {
        CollegeDto collegeDto = new CollegeDto();
        collegeDto.setCollegeName("L S Raheja College");

        List<FloorDto> floors = new ArrayList<>();
        FloorDto groundFloor = new FloorDto("G", 3, 0, 1, 0);
        FloorDto firstFloor = new FloorDto("F", 10, 1, 1, 1);
        floors.add(groundFloor);
        floors.add(firstFloor);
        collegeDto.setFloors(floors);

        List<FacultyDto> faculties = new ArrayList<>();
        faculties.add(new FacultyDto("Prajkata Ma'am", "9876543210", "prajkta@lsraheja.com"));
        faculties.add(new FacultyDto("Tirup Sir", "8765432109", "tirup@lsraheja.com"));
        collegeDto.setFaculties(faculties);

        List<CrDto> crs = new ArrayList<>();
        crs.add(new CrDto("Rahul", 101, "9123456780", "rahul@example.com", "prajkta@lsraheja.com", "8765432109"));
        crs.add(new CrDto("Priya", 102, "9234567890", "priya@example.com", "tirup@lsraheja.com", "9876543210"));
        collegeDto.setCrs(crs);

        registerCollege(collegeDto);
    }
}
