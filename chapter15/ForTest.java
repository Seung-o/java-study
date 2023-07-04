package chapter15;

public class ForTest {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        for (num = 1; num <= 10; num++) {
            sum += num;
        }
        System.out.println("sum: " + sum);
    }
}
