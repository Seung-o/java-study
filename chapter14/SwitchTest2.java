package chapter14;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 달을 입력해주세요.");
        int month = scanner.nextInt();

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2, 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                yield 0;
            }
        };

        System.out.println(month + "월은 " + day + "일까지 있습니다.");
    }
}
