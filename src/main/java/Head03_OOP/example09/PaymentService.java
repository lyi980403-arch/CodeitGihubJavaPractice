package Head03_OOP.example09;

public class PaymentService {

    // 결제 로직
    public void processPayment(UserAccount acc, double amount) {
        /*if (amount <= 0) {
            throw new IllegalArgumentException("결제 금액은 0보다 커야 합니다.");
        }*/
        // UserAccount의 private 필드(balance)에는 직접 접근 불가
        // 오직 withdraw() 메소드 호출을 통해서만 잔액을 조정
        acc.withdraw(amount);

        System.out.println("결제 완료. 잔액 " + acc.getBalance());
    }

    // 환불 로직
    public void processRefund(UserAccount acc, double amount) {
        /*if (amount <= 0) {
            throw new IllegalArgumentException("환불 금액은 0보다 커야 합니다.");
        }*/
        // 잔액 추가(입금)는 deposit() 메소드를 통해서만 가능
        acc.deposit(amount);

        System.out.println("환불 완료. 잔액: " + acc.getBalance());
    }
}
