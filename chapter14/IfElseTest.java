package chapter14;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int age;
        int charge;

        Scanner scanner = new Scanner(System.in);
        System.out.println("나이: ");
        age = scanner.nextInt();

        if (age < 8) {
            System.out.println("아동 입니다.");
            charge = 1000;
        } else if (age < 20) {
            System.out.println("청소년 입니다.");
            charge = 1500;
        } else {
            System.out.println("성인입니다.");
            charge = 2000;
        }

        System.out.println("요금은 " + charge + "원 입니다");
    }
}
