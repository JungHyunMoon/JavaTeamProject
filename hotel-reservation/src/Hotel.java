import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservationsList;
    private ArrayList<Guest> guestsList;
    private ArrayList<Room> roomsList;

    public Hotel(ArrayList<Reservation> reservationsList, ArrayList<Guest> guestsList, ArrayList<Room> roomsList) {
        this.reservationsList = reservationsList;
        this.guestsList = guestsList;
        this.roomsList = roomsList;
    }

    public ArrayList<Reservation> getReservationsList() {
        return reservationsList;
    }

    public ArrayList<Guest> getGuestsList() {
        return guestsList;
    }

    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public void setReservationsList(ArrayList<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }

    public void setGuestsList(ArrayList<Guest> guestsList) {
        this.guestsList = guestsList;
    }

    public void setRoomsList(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }

    public void printRoomsList(ArrayList<Room> roomsList){
        for(Room room : roomsList){
            System.out.println(room.toString());
        }
    }
    public void printReservationsList(ArrayList<Reservation> reservationsList){
        for(Reservation reservation : reservationsList){
            System.out.println(reservation.toString());
        }
    }

    public void printGuestList(ArrayList<Guest> guestsList){
        for(Guest guest : guestsList){
            System.out.println(guest.toString());
        }
    }
}
