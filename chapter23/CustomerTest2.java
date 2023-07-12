package chapter23;

import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(1000, "이순신");
        VipCustomer customerHa = new VipCustomer(1001, "하승오");
        GoldCustomer customerO = new GoldCustomer(1002, "오지수"); // type-casting (묵시적 형 변환이 가능)

        ArrayList<Customer> customerList = new ArrayList<Customer>(); // type-casting

        customerList.add(customerLee);
        customerList.add(customerHa);
        customerList.add(customerO);

        for(Customer customer : customerList) {
            customer.showCustomerInfo();
        }
    }
}
