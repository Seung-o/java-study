package chapter06;

public class DoubleTest {
    public static void main(String[] args) {
        double dNum = 3.14; // 자바에서는 실수의 기본형이 double 임
        float fNum = 3.14f; // 실수를 다른 자료형으로 표현

        System.out.println(dNum);
        System.out.println(fNum);

        double myNum = 1;
        for(int i = 0; i < 10000; i++) {
            myNum = myNum + 0.1;
        }

        System.out.println(myNum); // 부동 소수점 오류 확인
    }
}
