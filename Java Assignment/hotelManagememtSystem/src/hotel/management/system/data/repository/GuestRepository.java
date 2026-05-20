package main.hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.Guest;

import java.util.List;

public interface GuestRepository {

    Guest findByEmail(String email);
    Guest findByPhoneNumber(String phoneNumber);
//    Guest findByLastName(String lastName);
    List<Guest> findAll();

}