package chapter23;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerId(1000);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        customerLee.showCustomerInfo();

        VipCustomer customerHa = new VipCustomer();
        customerHa.setCustomerId(1001);
        customerHa.setCustomerName("하승오");
        customerHa.bonusPoint = 1500;
        customerHa.showCustomerInfo();

    }
}
