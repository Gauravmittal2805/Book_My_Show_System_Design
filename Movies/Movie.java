package BookMyShow.Movies;

public class Movie {
    public int movie_id;
    public String title;
    public String language;
    public int duration;
    public String genre;

    public Movie(int id, String title, String lang, int dur, String genre) {
        this.movie_id = id;
        this.title = title;
        this.language = lang;
        this.duration = dur;
        this.genre = genre;
    }
}
