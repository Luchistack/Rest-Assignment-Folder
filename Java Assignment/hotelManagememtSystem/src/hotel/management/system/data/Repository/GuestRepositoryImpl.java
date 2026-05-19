package main.hotel.management.system.data.Repository;

import main.hotel.management.system.exceptions.EmailNotFoundException;
import main.hotel.management.system.exceptions.StaffNotFoundException;
import main.hotel.management.system.data.Models.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestRepositoryImpl implements GuestRepository {

    private List<Guest> guests = new ArrayList<>();

    @Override
    public Guest findByEmail(String email) {
        for(Guest guest : guests){
            if(guest.getEmail().equals(email)){
                return guest;
            }
        }
        throw new EmailNotFoundException("Email not found");
    }
    @Override
    public Guest findByPhoneNumber(String phoneNumber) {
      for(Guest guest : guests){
          if(guest.getPhoneNumber().equals(phoneNumber)){
              return guest;
          }
      }
      throw new StaffNotFoundException("Guest not found");
    }
//
//    @Override
//        public Guest findByLastName(String lastName) {
//        return "";
//    }

    public void save(Guest guest) {
        guests.add(guest);
    }

    public Guest findByGuestId(String guestId) {
        for(Guest guest : guests){
            if(guest.getGuestId().equals(guestId)){
                return guest;
            }
        }
        throw new IllegalArgumentException("guest not found");
    }
    public List<Guest> findAll(){
        return guests;
    }
}
