package BookMyShow.Shows;

import BookMyShow.Movies.Movie;
import BookMyShow.Threaters.Threater;

public class Show {
    public int show_id;
    public Movie m;
    public Threater thr;
    public String start_time;
    public String end_time;
    public int avail_seats;

    public Show(int id, Movie m, Threater thr, String str_time, String end_time, int seats) {
        this.show_id = id;
        this.m = m;
        this.thr = thr;
        this.start_time = str_time;
        this.end_time = end_time;
        this.avail_seats = seats;
    }

}
