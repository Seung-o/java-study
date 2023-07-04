package chapter16;

public class NestedLoopTest {
    public static void main(String[] args) {
        int dan, time;

        for (dan = 2; dan <= 9; dan++) {
            for (time = 1; time <= 9; time++) {
                System.out.println(dan + "X" + time + "=" + dan * time);
            }
        }
    }
}
