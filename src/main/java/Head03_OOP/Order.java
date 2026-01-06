package Head03_OOP;

import Head03_OOP.example06.Payment;

public class Order {
    private String orderId;
    private boolean isPaid;
    private Payment payment;

    public Order() {
        this.orderId = "NONE";
        this.isPaid = false;
    }

    public Order(String orderId , boolean isPaid){
        this.orderId = orderId;
        this.isPaid = isPaid;
    }

    public Order(Payment payment) {
        this.payment = payment;
    }

    public String getOrderId(){
        return this.orderId;
    }

    public boolean getIsPaid(){
        return this.isPaid;
    }

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public void setIsPaid(boolean isPaid){
        this.isPaid = isPaid;
    }

    public void process(int amount) {
        if (payment != null) {
            payment.pay(amount);
        }
    }


    //getter or setter 생성 법 실습
}