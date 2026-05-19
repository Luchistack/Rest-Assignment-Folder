package main.hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.Payment;
import main.hotel.management.system.data.Models.ServiceCategory;

public interface ServiceRepository {

    ServiceCategory findByServiceCategory(ServiceCategory serviceCategory);
    double findByPrice(double price);
}
