package chapter26;

public class CompleteCalculator extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public void description() {
        System.out.println("It it Complete Calc.");
    }
}
