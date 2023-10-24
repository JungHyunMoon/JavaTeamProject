public class Room {
    public long roomId;
    public String roomType;
    public int capacity;
    public int price;
    public boolean status;

    public Room(long roomId, String roomType, int capacity, int price, boolean status) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.capacity = capacity;
        this.price = price;
        this.status = status;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}