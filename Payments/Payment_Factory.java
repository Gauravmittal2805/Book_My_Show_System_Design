package BookMyShow.Payments;

public class Payment_Factory {
    public static Payment get_Payment(String type) {
        return switch (type.toLowerCase()) {
            case "upi" -> new UPIPayment();
            case "cash" -> new CashPayment();
            case "card" -> new CardPayment();
            default -> null;
        };
    }
}
