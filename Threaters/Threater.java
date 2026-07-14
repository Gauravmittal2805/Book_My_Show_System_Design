package BookMyShow.Threaters;

import java.util.ArrayList;
import java.util.Random;

public class Threater {
    public int threater_Id;
    public String threater_name;
    public String location;
    public ArrayList<Seat> seats = new ArrayList<>();
    public int silver = 5;
    public int gold = 5;
    public int premium = 5;

    public Threater(int id, String name, String loc) {
        this.threater_Id = id;
        this.threater_name = name;
        this.location = loc;
    }

    public void generateSeats() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            seats.add(new Seat(rand.nextInt(100) + 100, i + 1, "Gold", 200, "Available"));
        }
        for (int i = 0; i < 5; i++) {
            seats.add(new Seat(rand.nextInt(100) + 100, i + 1, "Silver", 100, "Available"));
        }
        for (int i = 0; i < 5; i++) {
            seats.add(new Seat(rand.nextInt(100) + 100, i + 1, "Platinum", 300, "Available"));
        }
    }

}
