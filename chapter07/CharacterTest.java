package chapter07;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1); // 65

        char ch2 = 66;
        System.out.println(ch2); // B

        int ch3 = 67;
        System.out.println((char)ch3); // C

        char ch4 = '\uAC00';
        System.out.println(ch4); // 가
    }
}
