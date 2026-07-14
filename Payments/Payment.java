package BookMyShow.Payments;

public interface Payment {
    boolean pay(int amt);
}

class UPIPayment implements Payment {

    @Override
    public boolean pay(int amount) {
        System.out.println("Opening UPI...");
        System.out.println("UPI Payment Successful: " + amount + " rupees");
        return true;
    }
}

class CashPayment implements Payment {

    @Override
    public boolean pay(int amount) {
        System.out.println("Cash Payment Successful: " + amount + " rupees");
        return true;
    }
}

class CardPayment implements Payment {

    @Override
    public boolean pay(int amount) {
        System.out.println("Processing Card...");
        System.out.println("Card Payment Successful: " + amount + " rupees");
        return true;
    }
}
