package chapter23;

public class VipCustomer extends Customer {
    private int agentId = 0;

    public VipCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        System.out.println("VipCustomer() invoked");
        this.customerId = customerId;
        this.customerName = customerName;
        customerGrade = "VIP";
        salesRatio = 0.05;
        bonusRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
@Override
    public void showCustomerInfo(){
        super.showCustomerInfo();
        System.out.println("상담원 아이디는 " + agentId + " 입니다.");
    }
}
