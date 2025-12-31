import java.util.*;
public class HotelBooking {

    private String guestname;
    private String roomtype;
    private int nights;

    public HotelBooking() {
        this.guestname = "Unknown Guest";
        this.roomtype = "Standard";
        this.nights = 1;
    }
    public HotelBooking(String guestname, String roomtype, int nights) {
        this.guestname = guestname;
        this.roomtype = roomtype;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestname = other.guestname;
        this.roomtype = other.roomtype;
        this.nights = other.nights;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            HotelBooking defaultBooking = new HotelBooking();
            String guestname=sc.nextLine();     
            String roomtype=sc.nextLine();
            int nights=sc.nextInt();
            HotelBooking customBooking = new HotelBooking(guestname, roomtype, nights);
            HotelBooking copiedBooking = new HotelBooking(customBooking);
            System.out.println("Default Booking: GuestName=" + defaultBooking.guestname + ", RoomType=" + defaultBooking.roomtype + ", Nights=" + defaultBooking.nights);
            System.out.println("Custom Booking: GuestName=" + customBooking.guestname + ", RoomType=" + customBooking.roomtype + ", Nights=" + customBooking.nights);
            System.out.println("Copied Booking: GuestName=" + copiedBooking.guestname + ", RoomType=" + copiedBooking.roomtype + ", Nights=" + copiedBooking.nights);
    }
}
