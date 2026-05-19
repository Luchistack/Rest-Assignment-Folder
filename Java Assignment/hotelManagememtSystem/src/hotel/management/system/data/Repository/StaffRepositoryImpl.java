package main.hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.Role;
import main.hotel.management.system.data.Models.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepositoryImpl implements StaffRepository {

    private List<Staff> staffs = new ArrayList<>();


    @Override
    public void save(Staff staff) {
        staffs.add(staff);

    }

    @Override
    public Staff findByStaffId(String staffId) {
        for (Staff staff : staffs) {
            if (staff.getStaffId().equals(staffId)) {
                return staff;
            }
        }
        throw new IllegalArgumentException("Staff not found");
    }

    @Override
    public Role findByRole(Role role) {
        return null;
    }

    @Override
    public Staff findByEmail(String email) {
        for (Staff staff : staffs) {
            if (staff.getEmail().equals(email)) {
                return staff;
            }
        }
        throw new IllegalArgumentException("Staff not found");
    }


    @Override
    public int count() {
        int count = 0;

        for (Staff staff : staffs) {
            count++;
        }
        return count;
    }

    @Override
    public List<Staff> delete(Staff staff) {
        staffs.remove(staff);
        return staffs;

    }

    @Override
    public List<Staff> findAll() {
        return staffs;
    }

}