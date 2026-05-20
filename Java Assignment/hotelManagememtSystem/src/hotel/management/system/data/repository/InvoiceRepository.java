package main.hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.Booking;

public interface InvoiceRepository {

    Booking findByBooking(Booking booking);

}
