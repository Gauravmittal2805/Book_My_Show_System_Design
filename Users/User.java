package BookMyShow.Users;

interface Users {
    void user_details();

    void book_Ticket();

    void cancel_Ticket();
}

public class User implements Users {
    int userId;
    String name;
    String email;

    public User(int id, String name, String email) {
        this.userId = id;
        this.name = name;
        this.email = email;
    }

    public void user_details() {
        System.out.println("User ID: " + this.userId);
        System.out.println("User Name: " + this.name);
        System.out.println("User E-mail: " + this.email);

    }

    public void book_Ticket() {

    }

    public void cancel_Ticket() {

    }

}
