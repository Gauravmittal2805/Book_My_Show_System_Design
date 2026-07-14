package BookMyShow.Users;

import BookMyShow.BookMyShow;
import BookMyShow.Bookings.Booking;
import BookMyShow.Movies.Movie;
import BookMyShow.Shows.Show;
import BookMyShow.Threaters.Seat;
import BookMyShow.Threaters.Threater;

public class Admin extends User {

    public Admin() {
        super(9205, "Gaurav", "gauravmittal939@gmail.com");
    }

    public void Add_Movies(int id, String title, String lang, int dur, String genre) {
        BookMyShow.movies.add(new Movie(id, title, lang, dur, genre));
        System.out.println("Movie Added Successfully");
    }

    public void Add_Threater(int id, String name, String loc) {
        Threater thr = new Threater(id, name, loc);
        BookMyShow.threaters.add(thr);
        thr.generateSeats();
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-5s %-25s %-15s %-10s %-15s%n",
                "Seat ID", "Seat No.", "Seat Type", "Price", "Availability");
        System.out.println("--------------------------------------------------------------------------");
        for (Seat s : thr.seats) {

            System.out.printf("%-5d %-25d %-15s %-10d %-15s%n",
                    s.seat_id,
                    s.seat_num,
                    s.seat_type,
                    s.price,
                    s.available);
            System.out.println("--------------------------------------------------------------------------");
        }
    }

    public void show_Movies() {
        System.out.printf("%-5s %-25s %-15s %-10s %-15s%n",
                "ID", "Title", "Language", "Duration", "Genre");

        System.out.println("--------------------------------------------------------------------------");

        for (Movie m : BookMyShow.movies) {
            System.out.printf("%-5d %-25s %-15s %-10d %-15s%n",
                    m.movie_id,
                    m.title,
                    m.language,
                    m.duration,
                    m.genre);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public void show_Threaters() {
        System.out.printf("%-5s %-25s %-15s%n",
                "ID", "Name", "Location");

        System.out.println("--------------------------------------------------------------------------");

        for (Threater t : BookMyShow.threaters) {
            System.out.printf("%-5d %-25s %-15s%n",
                    t.threater_Id,
                    t.threater_name,
                    t.location);
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    public void Schedule_Show(int id, Movie m, Threater thr, String str_time, String end_time, int seats) {
        BookMyShow.shows.add(new Show(id, m, thr, str_time, end_time, seats));
        System.out.println("Show Schedule Successfully, Following are the details: ");
        System.out.println(id + ", " + m.title + "(" + m.language + "), " + thr.threater_name + "(" + thr.location
                + "), from " + str_time + " to " + end_time);
    }

    public void show_Shows() {
        System.out.println(
                "==============================================================================================================");
        System.out.printf("%-8s %-25s %-20s %-15s %-15s %-10s%n",
                "Show ID",
                "Movie",
                "Theatre",
                "Start Time",
                "End Time",
                "Seats");
        System.out.println(
                "==============================================================================================================");
        for (Show sh : BookMyShow.shows) {

            System.out.printf("%-8d %-25s %-20s %-15s %-15s %-10d%n",
                    sh.show_id,
                    sh.m.title,
                    sh.thr.threater_name,
                    sh.start_time,
                    sh.end_time,
                    sh.avail_seats);

            System.out.println(
                    "==============================================================================================================");
        }
    }

    public void show_Bookings() {
        System.out.println(
                "========================================================================================================================");
        System.out.printf("%-10s %-8s %-25s %-20s %-10s %-15s %-8s %-10s%n",
                "BookingID",
                "ShowID",
                "Movie",
                "Theatre",
                "Seat",
                "Payment",
                "Amount",
                "Status");
        System.out.println(
                "========================================================================================================================");
        for (Booking bk : BookMyShow.bookings) {
            System.out.printf("%-10d %-8d %-25s %-20s %-10s %-15s ₹%-7d %-10s%n",
                    bk.booking_id,
                    bk.sh.show_id,
                    bk.sh.m.title,
                    bk.sh.thr.threater_name,
                    bk.s.seat_num,
                    bk.pay,
                    bk.amt,
                    "Booked");

            System.out.println(
                    "========================================================================================================================");
        }
    }

}
