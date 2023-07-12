package chapter23;

public class CustomerTest {

    public static void main(String[] args) {
        int price = 10000;

        Customer customerLee = new Customer();
        customerLee.setCustomerId(1000);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        customerLee.showCustomerInfo();
        int costForLee = customerLee.calcPrice(price);
        System.out.println("금액은 " + costForLee + " 입니다.");

        VipCustomer customerHa = new VipCustomer(1001, "하승오");
        Customer customerO = new VipCustomer(1002, "오지수"); // type-casting (묵시적 형 변환이 가능)

        customerHa.bonusPoint = 1500;
        customerHa.showCustomerInfo();

        int costForHa = customerHa.calcPrice(price);
        System.out.println("금액은 " + costForHa + " 입니다.");

    }
}
