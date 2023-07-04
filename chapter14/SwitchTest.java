package chapter14;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 달을 입력해주세요.");
        int month = scanner.nextInt();

        int day = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");

        }

        System.out.println(month + "월은 " + day + "일까지 있습니다.");
    }
}
