package chapter23;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;

    double salesRatio;


    int bonusPoint; // 인스턴스 변수는 자동으로 초기화 ( 0 )
    double bonusRatio; // 인스턴스 변수는 자동으로 초기화 ( 0.0 )

    public Customer(int customerId, String customerName) {
        System.out.println("Customer() invoked");
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        bonusRatio = 0.01;
    }


    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }


    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void showCustomerInfo() {
        System.out.println("고객님의 이름은 " + this.customerName  +"이고, 고객님의 등급은 " + this.customerGrade + " 입니다.");
    }
}
