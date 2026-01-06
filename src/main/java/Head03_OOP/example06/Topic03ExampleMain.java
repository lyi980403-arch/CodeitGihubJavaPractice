package Head03_OOP.example06;

import Head03_OOP.Order;

public class Topic03ExampleMain {
    public static void main(String[] args) {
        Order o1 = new Order(new CreditCardPayment());
        o1.process(50000);

        Order o2 = new Order(new AccountTransferPayment());
        o2.process(30000);

        Order o3 = new Order(new CryptoPayment());
        o3.process(70000);

       /* Order o1 = new Order(new CreditCardPayment());
        o1.process(50000);
        o1.cancel(50000);

        Order o2 = new Order(new AccountTransferPayment());
        o2.process(30000);
        o2.cancel(30000);

        Order o3 = new Order(new CryptoPayment());
        o3.process(45000);
        o3.cancel(45000);*/
    }
}