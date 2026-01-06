package Head03_OOP.example06;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        // Payment 인터페이스 기반으로 다형성 처리
        method.pay(amount);
    }
}

