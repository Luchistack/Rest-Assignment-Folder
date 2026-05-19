package data.repositories;

import main.hotel.management.system.data.Models.Guest;
import main.hotel.management.system.data.Repository.GuestRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuestRepositoryImplTest {

    @Test
    void testThatRepoCanSaveStudent(){

       GuestRepositoryImpl repository = new GuestRepositoryImpl();

        Guest guest = new Guest("1", "James", "Micheal", "james@gmail.com", "07080100701", "2 james street", "Nigeria");

        repository.save(guest);

        Guest foundGuest = repository.findByGuestId("1");

        assertEquals(guest, foundGuest);

    }
    @Test
    void testThtRepositoryCanAddXYZAndGetXandZById(){

        GuestRepositoryImpl repository = new GuestRepositoryImpl();
        Guest guest = new Guest("1", "James", "Micheal", "james@gmail.com", "07080100701", "2 james street", "Nigeria");
        Guest guestOne = new Guest("2", "Joy", "Hope", "joy@gmail.com", "07073881814", "2 andrew street", "Nigeria");
        Guest guestTwo = new Guest("3", "Jack", "Car", "jack@gmail.com", "090950321345", "2 cool street", "Nigeria");

        repository.save(guest);
        repository.save(guestOne);
        repository.save(guestTwo);

        Guest foundGuest = repository.findByGuestId("1");
        Guest foundGuest2 = repository.findByGuestId("3");

        assertEquals(guest, foundGuest);
        assertEquals(guestTwo, foundGuest2);

    }
    @Test
    void testThatGuestCanBeFoundByEmail(){

        GuestRepositoryImpl repository = new GuestRepositoryImpl();
        Guest guestOne = new Guest("2", "Joy", "Hope", "joy@gmail.com", "07073881814", "2 andrew street", "Nigeria");
        Guest guestTwo = new Guest("3", "Jack", "Car", "jack@gmail.com", "090950321345", "2 cool street", "Nigeria");

        repository.save(guestOne);
        repository.save(guestTwo);

        Guest foundGuestOne = repository.findByEmail("joy@gmail.com");
        Guest foundGuestTwo = repository.findByEmail("jack@gmail.com");

        assertEquals(guestOne, foundGuestOne);
        assertEquals(guestTwo, foundGuestTwo);
    }
    @Test
    void testThatAllGuestCanBeFound(){

        GuestRepositoryImpl repository = new GuestRepositoryImpl();
        Guest guest = new Guest("1", "James", "Micheal", "james@gmail.com", "07080100701", "2 james street", "Nigeria");
        Guest guestOne = new Guest("2", "Joy", "Hope", "joy@gmail.com", "07073881814", "2 andrew street", "Nigeria");
        Guest guestTwo = new Guest("3", "Jack", "Car", "jack@gmail.com", "090950321345", "2 cool street", "Nigeria");

        repository.save(guest);
        repository.save(guestOne);
        repository.save(guestTwo);

        List<Guest> guests = repository.findAll();

        assertEquals(3, guests.size());

    }
    @Test
    void testThatGuestCanBeFoundByPhoneNumber(){
        GuestRepositoryImpl repository = new GuestRepositoryImpl();
        Guest guest = new Guest("1", "James", "Micheal", "james@gmail.com", "07080100701", "2 james street", "Nigeria");
        Guest guestOne = new Guest("2", "Joy", "Hope", "joy@gmail.com", "07073881814", "2 andrew street", "Nigeria");

        repository.save(guest);
        repository.save(guestOne);

        Guest foundGuest = repository.findByPhoneNumber("07080100701");

        assertEquals(guest, foundGuest);
    }
//    @Test
//    void testThatGuestCanBeFoundByLastName(){
//        GuestRepositoryImpl repository = new GuestRepositoryImpl();
//        Guest guest = new Guest("1", "James", "Micheal", "james@gmail.com", "07080100701", "2 james street", "Nigeria");
//        Guest guestOne = new Guest("2", "Joy", "Hope", "joy@gmail.com", "07073881814", "2 andrew street", "Nigeria");
//
//        repository.save(guest);
//        repository.save(guestOne);
//
//        Guest foundGuest = repository.findByLastName("Micheal");
//
//        assertEquals(guest, foundGuest);
//    }
}
