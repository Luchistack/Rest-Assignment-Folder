package hotel.management.system.data.Repository;

import main.hotel.management.system.data.Models.RoomType;
import main.hotel.management.system.data.Models.Status;

public interface RoomRepository {
    Status findByStatus(Status status);
    RoomType findByRoomType(RoomType roomType);
}
