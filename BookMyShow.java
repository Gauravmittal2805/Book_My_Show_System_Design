package BookMyShow;

import BookMyShow.Bookings.Booking;
import BookMyShow.Movies.Movie;
import BookMyShow.Shows.Show;
import BookMyShow.Threaters.Threater;
import java.util.*;

public class BookMyShow {
    private static BookMyShow app;
    public static ArrayList<Movie> movies = new ArrayList<>();
    public static ArrayList<Threater> threaters = new ArrayList<>();
    public static ArrayList<Show> shows = new ArrayList<>();
    public static ArrayList<Booking> bookings = new ArrayList<>();

    private BookMyShow() {

    }

    public static BookMyShow getInstance() {
        if (app == null) {
            app = new BookMyShow();
            System.out.println("App Created");
        }
        return app;

    }

    public static void seed_Data() {
        Movie m1 = new Movie(1, "Robot", "Hindi", 140, "Action");
        Movie m2 = new Movie(2, "Toy Story", "Hindi", 120, "Creative");
        Movie m3 = new Movie(3, "Dhurunder", "Hindi", 200, "Action");
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        Threater th1 = new Threater(1, "Roopam Cine World", "Mathura");
        Threater th2 = new Threater(2, "Gold Cinema", "Mathura");
        Threater th3 = new Threater(3, "JV Cinema", "TownShip");
        th1.generateSeats();
        th2.generateSeats();
        th3.generateSeats();
        threaters.add(th1);
        threaters.add(th2);
        threaters.add(th3);
        System.out.println("Movies and Threater Seeded Successfully");
        System.out.println();
        Show sh1 = new Show(141, m1, th1, "12:30 AM", "02:40 AM", 15);
        Show sh2 = new Show(136, m2, th2, "01:30 AM", "03:30 AM", 15);
        Show sh3 = new Show(145, m3, th3, "04:20 AM", "06:40 AM", 15);
        Show sh4 = new Show(120, m2, th1, "07:30 AM", "10:40 AM", 15);
        Show sh5 = new Show(290, m3, th2, "10:30 PM", "12:40 PM", 15);
        Show sh6 = new Show(387, m1, th3, "11:30 PM", "02:10 AM", 15);
        Show sh7 = new Show(489, m3, th1, "09:30 AM", "12:10 AM", 15);
        shows.add(sh1);
        shows.add(sh2);
        shows.add(sh3);
        shows.add(sh4);
        shows.add(sh5);
        shows.add(sh6);
        shows.add(sh7);

    }
}
