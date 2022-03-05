import com.hotel.hotel.*;
import com.hotel.guest.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Hotel hotel = new Hotel(10);
        Guest g1 = new Guest("Amit", "Pune", "Delux", 2);
        g1.bookRoom();

    }
}
