package main.hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.Booking;
import main.hotel.management.system.data.Models.PaymentMethod;
import main.hotel.management.system.data.Models.PaymentStatus;

public interface PaymentRepository {
    Booking findByBooking(Booking booking);
    PaymentStatus findByPaymentStatus(PaymentStatus paymentStatus);
    PaymentMethod findByPaymentMethod(PaymentMethod paymentMethod);
}
