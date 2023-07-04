package chapter15;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        do {
            System.out.println("Input 을 입력해주세요.");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("sum: " + sum);
    }
}
