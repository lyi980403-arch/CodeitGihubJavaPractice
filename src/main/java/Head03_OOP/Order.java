package Head03_OOP;

public class Order {
    private String orderId;
    private boolean isPaid;

    public Order() {
        this.orderId = "NONE";
        this.isPaid = false;
    }

    public Order(String orderId , boolean isPaid){
        this.orderId = orderId;
        this.isPaid = isPaid;
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




    //getter or setter 생성 법 실습
}