package data.repositories;


import main.hotel.management.system.data.Models.Staff;
import main.hotel.management.system.data.Repository.StaffRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static main.hotel.management.system.data.Models.Role.*;
import static org.junit.Assert.*;

public class StaffRepositoryImplTest {

    @Test
    void testThatRepoCanSaveANewStaffInfo(){
        StaffRepositoryImpl repository = new StaffRepositoryImpl();
        Staff staff = new Staff("1", "faith","Dike",RECEPTIONIST, "ftoluchi@gmail.com", "07080100701",200_000);

        repository.save(staff);

        Staff foundStaff = repository.findByStaffId("1");

        assertEquals(staff, foundStaff);
    }


    @Test
    void testThatStaffsCanBeFoundByEmail(){
        StaffRepositoryImpl repository = new StaffRepositoryImpl();
        Staff staffOne = new Staff("1", "faith","Dike",RECEPTIONIST, "ftoluchi@gmail.com", "07080100701",200_000);
       Staff  staffTwo = new Staff( "2", "blessing", "James",MANAGER,"blessing@gmail.com", "07073881814",100_000);
        Staff staffThree = new Staff("Joy", "joy", "Micheal", HOUSEKEEPER, "joy@gmail.com", "0708199611715", 100_000);

        repository.save(staffOne);
        repository.save(staffTwo);
        repository.save(staffThree);

        Staff foundStaff = repository.findByEmail("joy@gmail.com");

        assertEquals(staffThree, foundStaff);

    }
    @Test
    void testThatAllStaffsCanBeFound(){

        StaffRepositoryImpl repository = new StaffRepositoryImpl();
        Staff staffOne = new Staff("1", "faith","Dike",RECEPTIONIST, "ftoluchi@gmail.com", "07080100701",200_000);
        Staff  staffTwo = new Staff( "2", "blessing", "James",MANAGER,"blessing@gmail.com", "07073881814",100_000);
        Staff staffThree = new Staff("Joy", "joy", "Micheal", HOUSEKEEPER, "joy@gmail.com", "0708199611715", 100_000);

        repository.save(staffOne);
        repository.save(staffTwo);
        repository.save(staffThree);


        List<Staff> staffs = repository.findAll();

        assertEquals(3, staffs.size());

    }
    @Test
    void testThatRepoCAnDeleteAStaff(){
        StaffRepositoryImpl repository = new StaffRepositoryImpl();
        Staff staffOne = new Staff("1", "faith","Dike",RECEPTIONIST, "ftoluchi@gmail.com", "07080100701",200_000);
        Staff  staffTwo = new Staff( "2", "blessing", "James",MANAGER,"blessing@gmail.com", "07073881814",100_000);
        Staff staffThree = new Staff("Joy", "joy", "Micheal", HOUSEKEEPER, "joy@gmail.com", "0708199611715", 100_000);

        repository.save(staffOne);
        repository.save(staffTwo);
        repository.save(staffThree);


        List<Staff> staffs = repository.delete(staffTwo);

        assertEquals(2, staffs.size());

    }
    @Test
    void testThatRepCanCountNumberOfStaffs(){

        StaffRepositoryImpl repository = new StaffRepositoryImpl();
        Staff staffOne = new Staff("1", "faith","Dike",RECEPTIONIST, "ftoluchi@gmail.com", "07080100701",200_000);
        Staff  staffTwo = new Staff( "2", "blessing", "James",MANAGER,"blessing@gmail.com", "07073881814",100_000);
        Staff staffThree = new Staff("Joy", "joy", "Micheal", HOUSEKEEPER, "joy@gmail.com", "0708199611715", 100_000);

        repository.save(staffOne);
        repository.save(staffTwo);
        repository.save(staffThree);


        assertEquals(3, repository.count());

    }

}
