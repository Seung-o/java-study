package chapter22;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] ids;
        ids = new int[]{10, 20, 30};

        for (int id : ids) {
            System.out.println(id);
        }

        int[] arr = new int[10];
        for (int i = 0, num = 1; num < arr.length; num++) {
            arr[i] = num;
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println(total);

        double mTotal = 1;

        double[] dArr = new double[5];
        dArr[0] = 1.1;
        dArr[1] = 2.1;
        dArr[2] = 3.1;

        for (double v : dArr) {
            mTotal *= v;
        }

        System.out.println(mTotal); // 0.0 선언된 배열은 자동으로 초기화된다. 객체 배열의 경우, null로 초기화됨.
    }
}
