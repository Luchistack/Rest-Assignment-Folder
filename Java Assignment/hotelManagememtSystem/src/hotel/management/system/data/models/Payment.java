package main.hotel.management.system.data.Models;

import main.hotel.management.system.data.Models.Booking;

import java.time.LocalDate;

public class Payment {
    private String paymentId;
    private Booking bookingId;
    private double amountPaid;
    private LocalDate paymentDate;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;




}
