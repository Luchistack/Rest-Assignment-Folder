package main.hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.Role;
import main.hotel.management.system.data.Models.Staff;

import java.util.List;

public interface StaffRepository {

    void save(Staff staff);
    Staff findByStaffId(String staffId);
    Role findByRole(Role role);
    Staff findByEmail(String email);
    int count();
    List<Staff> delete(Staff staff);
    List<Staff> findAll();
}