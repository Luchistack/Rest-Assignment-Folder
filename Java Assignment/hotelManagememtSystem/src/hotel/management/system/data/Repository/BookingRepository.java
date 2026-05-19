package main.hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.BookingStatus;
import main.hotel.management.system.data.Models.Guest;
import main.hotel.management.system.data.Models.Room;

import java.time.LocalDate;

public interface BookingRepository {
    Guest findByGuest(Guest guest);
    Room findByRoom(Room room);
    BookingStatus findByBookingStatus(BookingStatus bookingStatus);
    LocalDate findByCheckedInDate(LocalDate checkedInDate);
}
