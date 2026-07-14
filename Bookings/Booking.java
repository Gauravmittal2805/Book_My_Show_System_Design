package BookMyShow.Bookings;

import BookMyShow.Shows.Show;
import BookMyShow.Threaters.Seat;

public class Booking {
    public int booking_id;
    public Show sh;
    public Seat s;
    public int amt;
    public String pay;

    public Booking(int id, Show sh, Seat s, int amt, String Pay) {
        this.booking_id = id;
        this.sh = sh;
        this.s = s;
        this.amt = amt;
        this.pay = Pay;
    }

    public void Generate_Ticket(Booking b) {
        Ticket t = new Ticket(b);
        printTicket(t);

    }

    public void printTicket(Ticket t) {

        System.out
                .println("==========================================================================================");
        System.out.println("                           BOOK MY SHOW - MOVIE TICKET");
        System.out
                .println("==========================================================================================");
        System.out.println();

        System.out.printf("%-20s %-20s %-20s%n",
                "Booking ID: " + t.b.booking_id,
                "Ticket ID : " + t.ticket_id,
                "Status : CONFIRMED");

        System.out.println();

        System.out.printf("%-12s %s%n", "Movie      :", t.b.sh.m.title + "(" + t.b.sh.m.language + ")");
        System.out.printf("%-12s %s%n", "Theatre    :", t.b.sh.thr.threater_name + ", " + t.b.sh.thr.location);
        System.out.printf("%-12s %s%n", "Show       :",
                t.b.sh.show_id + " | " + t.b.sh.start_time + " - " + t.b.sh.end_time);
        System.out.printf("%-12s %s%n", "Seats      :", "" + t.b.s.seat_type.charAt(0) + t.b.s.seat_num);
        System.out.printf("%-12s %s%n", "Payment    :", t.b.pay + " | " + t.b.amt + "  | " + "SUCCESS");

        System.out.println();
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println("                                   IMPORTANT NOTICE");
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println("- Please arrive 15 minutes before the show.");
        System.out.println("- Carry a valid ID proof if required.");
        System.out.println("- Tickets once booked cannot be cancelled or refunded.");
        System.out.println("- Show this ticket at the theatre entrance.");
        System.out.println("- Outside food and beverages are not allowed.");

        System.out.println();
        System.out
                .println("==========================================================================================");
        System.out.println("                  Thank You For Choosing BookMyShow!");
        System.out.println("                         Enjoy Your Movie 🍿");
        System.out
                .println("==========================================================================================");
    }
}
