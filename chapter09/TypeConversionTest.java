package chapter09;

public class TypeConversionTest {
    public static void main(String[] args) {
        int iNum = 10;

        // 암묵적 형 변환 (Implicit Type Conversion)
        // 더 정밀한 타입으로의 변환은 명시가 따로 필요하지 않다.
        long lNum = iNum;
        System.out.println(lNum);


        double dNum = 1.2;
        float fNum = 0.9f;

        // int iNum1 = dNum + fNum; occurs error
        // 명시적 형 변환(Explicit Type Conversion)
        // 덜 정밀한 타입으로의 변환은 명시를 해주어야 한다.
        int iNum1 = (int)dNum + (int)fNum; // 1
        int iNum2 = (int)(dNum + fNum); // 2

        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
