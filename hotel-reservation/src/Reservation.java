public class Reservation {
    private long roomId;
    private String guestName;
    private String phone;
    private String date;

    public Reservation(long roomId, String guestName, String phone, String date) {
        this.roomId = roomId;
        this.guestName = guestName;
        this.phone = phone;
        this.date = date;
    }
}
