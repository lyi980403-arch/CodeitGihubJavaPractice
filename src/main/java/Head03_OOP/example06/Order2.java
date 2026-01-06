package Head03_OOP.example06;

public class Order2 {
    private Payment payment;

    public Order2(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    /*private AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    public void cancel(double amount) {
        payment.cancel(amount);
    }*/

}
