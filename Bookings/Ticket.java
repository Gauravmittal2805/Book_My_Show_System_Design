package BookMyShow.Bookings;

import java.util.Random;

public class Ticket {
    int ticket_id;
    Booking b;

    public Ticket(Booking b) {
        Random rand = new Random();
        ticket_id = rand.nextInt(1000) + 1000;
        this.b = b;
    }
}
