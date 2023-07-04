package chapter17;

public class BreakTest {
    public static void main(String[] args) {
        int num, sum = 0;
        for (num = 1; ; num++) {
            sum += num;
            if (sum >= 100) {
                break;
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("num: " + num);
    }
}
