package main.hotel.management.system.data.Models;

import java.time.LocalDate;

public class Invoice {
    private String invoiceId;
    private Booking bookingId;
    private ServiceCategory serviceCategory;
    private double totalAmount;
    private double tax;
    private LocalDate issueDate;

}
