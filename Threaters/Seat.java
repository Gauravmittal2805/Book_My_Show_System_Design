package BookMyShow.Threaters;

public class Seat {
    public int seat_id;
    public int seat_num;
    public String seat_type;
    public int price;
    public String available;

    Seat(int id, int num, String type, int price, String avail) {
        this.seat_id = id;
        this.seat_num = num;
        this.seat_type = type;
        this.price = price;
        this.available = avail;
    }

}
