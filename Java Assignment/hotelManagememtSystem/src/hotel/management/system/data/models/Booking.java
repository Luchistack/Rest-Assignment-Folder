package main.hotel.management.system.data.Models;

import java.time.LocalDate;

public class Booking {

    private String bookingId;
    private Guest guest;
    private Room room;
    private LocalDate checkedInDate;
    private LocalDate checkedOutDate;
    private double totalAmount;
    private BookingStatus bookingStatus;

}

