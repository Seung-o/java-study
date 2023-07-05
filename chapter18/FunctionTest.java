package chapter18;

public class FunctionTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int result = addNum(n1, n2);
        print("result: " + result);


    }

    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
