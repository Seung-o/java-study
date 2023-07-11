package chapter23;

public class VipCustomer extends Customer {
    private int agentId;
    double salesRatio;

    public VipCustomer() {
        customerGrade = "VIP";
        salesRatio = 0.05;
        bonusRatio = 0.1;
    }
}
