package chapter11;

public class ShortCircuitEvaluation {
    public static void main(String[] args) {
        int num1 = 10;
        int i =2;

        boolean value;
        value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // && 연산자는 앞의 항의 값에 따라 뒤의 항을 수행하지 않을 수 있다.
        System.out.println(value); // false
        System.out.println(num1); // 20
        System.out.println(i); // 2

        value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
        System.out.println(value); // true
        System.out.println(num1); // 30
        System.out.println(i); // 4
    }
}
