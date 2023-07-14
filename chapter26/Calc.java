package chapter26;

public interface Calc {
    double PI = 3.14;

    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    default void description() {
        interfaceMethod();
        System.out.println("It is Calc.");
    }

    private void interfaceMethod() {
        System.out.println("It is interfaceMethod");
    }
}
