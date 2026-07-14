package BookMyShow;

import BookMyShow.Bookings.Booking;
import BookMyShow.Movies.Movie;
import BookMyShow.Payments.Payment;
import BookMyShow.Payments.Payment_Factory;
import BookMyShow.Shows.Show;
import BookMyShow.Threaters.Seat;
import BookMyShow.Threaters.Threater;
import BookMyShow.Users.Admin;
import BookMyShow.Users.User;
import java.util.*;

public class Main {
    static User user;
    static Admin ad = new Admin();

    public static void main(String[] args) {
        BookMyShow app = BookMyShow.getInstance();
        BookMyShow.seed_Data();
        main_menu();
    }

    static void main_menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========WelCome in BookMyShow============");
        System.out.println("Select Your Role");
        System.out.println("1]Admin             2]User");
        int role = sc.nextInt();
        switch (role) {
            case 1: {
                System.out.println();
                System.out.println("Welcome Back,Admin");
                System.out.println(
                        "1]Add Movie       2]Add Threater       3]Show Movies       4]Show Threaters       5]Schedule show       6]Current Shows       7]List Of Bookings");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        while (true) {
                            System.out.print("Enter Movie ID: ");
                            int movie_id = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Movie Title: ");
                            String title = sc.nextLine();
                            System.out.print("Enter Movie Language: ");
                            String lang = sc.nextLine();
                            System.out.print("Enter Movie Duration(in Minutes): ");
                            int duration = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Movie Genre: ");
                            String genre = sc.nextLine();
                            ad.Add_Movies(movie_id, title, lang, duration, genre);
                            System.out.println("Press 1 for Add New Movie, 2 for Home Menu");
                            int opt = sc.nextInt();
                            switch (opt) {
                                case 1:
                                    continue;
                                case 2:
                                    main_menu();
                                    break;
                                default:
                                    System.out.println("Invalid Option");

                            }
                            break;
                        }
                        break;
                    case 2:
                        while (true) {
                            System.out.print("Enter Threater ID: ");
                            int thr_id = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Threater Name: ");
                            String thr_name = sc.nextLine();
                            System.out.print("Enter Threater Location: ");
                            String thr_Loc = sc.nextLine();
                            ad.Add_Threater(thr_id, thr_name, thr_Loc);
                            System.out.println("Press 1 for Add New Threater, 2 for Home Menu");
                            int opt = sc.nextInt();
                            switch (opt) {
                                case 1:
                                    continue;
                                case 2:
                                    main_menu();
                                    return;
                                default:
                                    System.out.println("Invalid Option");

                            }
                        }
                    case 3:
                        ad.show_Movies();
                        System.out.println("Press 1 for Home Menu, 0 for Exit");
                        int opt = sc.nextInt();
                        switch (opt) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                main_menu();
                                break;
                            default:
                                System.out.println("Invalid Option");

                        }
                        break;
                    case 4:
                        ad.show_Threaters();
                        System.out.println("Press 1 for Home Menu, 0 for Exit");
                        int opti = sc.nextInt();
                        switch (opti) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                main_menu();
                                break;
                            default:
                                System.out.println("Invalid Option");

                        }

                        break;
                    case 5:
                        while (true) {
                            System.out.print("Enter Show Id: ");
                            int id = sc.nextInt();
                            Movie m = null;
                            while (true) {
                                System.out.print("Enter Movie ID: ");
                                int mov_id = sc.nextInt();
                                for (Movie mo : BookMyShow.movies) {
                                    if (mo.movie_id == mov_id) {
                                        m = mo;
                                        break;
                                    }
                                }
                                if (m == null) {
                                    System.out.println("Movie is Not Available,Try Again");
                                } else {
                                    break;
                                }
                            }
                            Threater thr = null;
                            while (true) {
                                System.out.print("Enter Threater ID: ");
                                int thr_id = sc.nextInt();
                                for (Threater th : BookMyShow.threaters) {
                                    if (thr_id == th.threater_Id) {
                                        thr = th;
                                        break;
                                    }
                                }
                                if (thr == null) {
                                    System.out.println("Threater is Not Available,Try Again");
                                } else {
                                    break;
                                }
                            }
                            sc.nextLine();
                            System.out.print("Enter Start Time(Format:'09:00 AM'): ");
                            String str_time = sc.nextLine();
                            System.out.print("Enter End Time(Format:'04:00 PM'): ");
                            String end_time = sc.nextLine();
                            ad.Schedule_Show(id, m, thr, str_time, end_time, 15);
                            System.out.println("Press 1 for Add New Show, 2 for Home Menu");
                            int option = sc.nextInt();
                            switch (option) {
                                case 1:
                                    continue;
                                case 2:
                                    main_menu();
                                    break;
                                default:
                                    System.out.println("Invalid Option");
                            }
                        }
                    case 6:
                        ad.show_Shows();
                        System.out.println("Press 1 for Home Menu, 0 for Exit");
                        int o = sc.nextInt();
                        switch (o) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                main_menu();
                                break;
                            default:
                                System.out.println("Invalid Option");

                        }

                        break;

                    case 7:
                        ad.show_Bookings();
                        System.out.println("Press 1 for Home Menu, 0 for Exit");
                        int ot = sc.nextInt();
                        switch (ot) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                main_menu();
                                break;
                            default:
                                System.out.println("Invalid Option");

                        }

                        break;
                    default:
                        System.out.println("Invalid Option");

                }
                break;

            }
            case 2: {
                System.out.println("1]Add Info     2]Show Info     3]Book ticket      4]Cancel Ticket");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Enter Your ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Your Name: ");
                        String name = sc.nextLine();
                        System.out.print("EnterYour Email: ");
                        String email = sc.nextLine();
                        user = new User(id, name, email);
                        break;

                    case 2:
                        user.user_details();
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("Enter Your Location: ");
                        String loc = sc.nextLine();
                        System.out.println("These are the Threaters in your Location,Please Select Threater:");
                        System.out.println();
                        int c = 0;
                        int i = 1;
                        for (Threater t : BookMyShow.threaters) {
                            String t_loc = t.location.toLowerCase();
                            if (t_loc.equals(loc.toLowerCase())) {
                                System.out.println(i + "]" + t.threater_name);
                                System.out.println();
                                c++;
                                i++;
                            }
                        }
                        if (c == 0) {
                            System.out.println("No Threater Found");
                        }
                        int sel_thr = sc.nextInt();
                        String se_thr = BookMyShow.threaters.get(sel_thr - 1).threater_name;
                        System.out.println("Following Are the Shows in " + se_thr + ", Choose a Show: ");
                        System.out
                                .println("--------------------------------------------------------------------------");
                        System.out.printf("%-15s %-25s %-25s %-15s %-15s %-15s %-15s %-15s%n",
                                "Show ID", "Movie Title", "Threater Name", "Start_Time", "End_Time", "Silver Seats",
                                "Gold Seats", "Premium Seats");
                        for (Show sh : BookMyShow.shows) {
                            String thr_name = sh.thr.threater_name.toLowerCase();
                            if (thr_name.equals(se_thr.toLowerCase())) {
                                System.out.printf("%-15d %-25s %-25s %-15s %-15s %-15d %-15d %-15d%n",
                                        sh.show_id, sh.m.title, sh.thr.threater_name, sh.start_time, sh.end_time,
                                        sh.thr.silver, sh.thr.gold, sh.thr.premium);

                                System.out.println(
                                        "--------------------------------------------------------------------------");
                            }
                        }
                        int book_id = 1;
                        System.out.print("Enter Show Id: ");
                        int show = sc.nextInt();
                        Show sh = null;
                        for (Show s : BookMyShow.shows) {
                            if (s.show_id == show) {
                                sh = s;
                            }
                        }
                        System.out.print("Enter Seat Type(S/G/P): ");
                        char ch = sc.next().charAt(0);
                        StringBuilder sb = new StringBuilder();
                        switch (Character.toUpperCase(ch)) {
                            case 'S':
                                sb.append("Silver");
                                break;
                            case 'G':
                                sb.append("Gold");
                                break;
                            case 'P':
                                sb.append("Platinum");
                                break;
                            default:
                                System.out.println("Entered Wrong Seat Type,Booking Terminate");
                                break;
                        }
                        Seat user_seat = null;
                        for (Seat s : BookMyShow.threaters.get(sel_thr - 1).seats) {
                            if (s.seat_type.equals(sb.toString()) && s.available.equals("Available")) {
                                user_seat = s;
                                break;
                            }
                        }
                        if (user_seat == null) {
                            System.out.println(sb.toString() + " Seats are Full in " + se_thr + " ,Booking Terminate");
                            break;
                        }
                        System.out.println("Select Payment Option: ");
                        System.out.println("1]UPI     2]Cash    3]Card");
                        int pay_method = sc.nextInt();
                        String pay_m = "";
                        Payment_Factory factory = new Payment_Factory();
                        int price = user_seat.price;
                        Payment payment = null;
                        if (pay_method == 1) {
                            payment = (Payment) factory.get_Payment("upi");
                            pay_m = pay_m + "UPI";
                        } else if (pay_method == 2) {
                            payment = (Payment) factory.get_Payment("cash");
                            pay_m = pay_m + "CASH";
                        } else if (pay_method == 3) {
                            payment = (Payment) factory.get_Payment("card");
                            pay_m = pay_m + "CARD";
                        }
                        if (payment != null && payment.pay(price)) {
                            Booking b = new Booking(book_id, sh, user_seat, user_seat.price, pay_m);
                            b.Generate_Ticket(b);
                            BookMyShow.bookings.add(b);
                            book_id++;
                        }
                        System.out.println("Press 1 for Home Menu, 0 for Exit");
                        int ot = sc.nextInt();
                        switch (ot) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                main_menu();
                                break;
                            default:
                                System.out.println("Invalid Option");
                        }
                        break;
                    case 4:
                        System.out.println("Disclaimer:There is No Refund on Cancelling Ticket.");
                        System.out.print("Confirmation(Y/N): ");
                        sc.nextLine();
                        char msg = sc.next().charAt(0);
                        if (Character.toUpperCase(msg) == 'Y') {
                            System.out.print("Enter Your Booking ID: ");
                            int bo_id = sc.nextInt();
                            BookMyShow.bookings.remove(bo_id - 1);
                            System.out.println("Your Booking Cancelled SuccessFully");
                        } else {
                            System.out.println("Press 1 for Home Menu, 0 for Exit");
                            int opi = sc.nextInt();
                            switch (opi) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    main_menu();
                                    break;
                                default:
                                    System.out.println("Invalid Option");
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
                break;
            }
            default:
                System.out.println("Select Valid Role");
                main_menu();
                break;
        }
    }

}
