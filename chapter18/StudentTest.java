package chapter18;

public class StudentTest {

    public static void main(String[] args) {
        Student studentHa = new Student(1, "Ha");
        studentHa.studentAddress = "Seoul";
        studentHa.setKoreaSubject("국어", 90);
        studentHa.setMathSubject("수학", 100);

        Student studentO = new Student(2, "O");
        studentO.studentAddress = "Nonsan";

        studentHa.showStudentInfo();
        studentO.showStudentInfo();

        System.out.println(studentHa);
        System.out.println(studentO);

        studentHa.showTotalScore();
    }
}
