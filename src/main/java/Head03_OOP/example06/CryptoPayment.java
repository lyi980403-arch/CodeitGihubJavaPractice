package Head03_OOP.example06;

public class CryptoPayment implements Payment {

    public void pay(double amount) {
        System.out.println("크립토로 " + amount + "원 결제 완료.");
    }
}
