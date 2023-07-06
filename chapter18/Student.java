package chapter18;

public class Student {
    int studentId;
    String studentName;
    String studentAddress;
    Subject korea;
    Subject math;

    public Student() {
        this.korea = new Subject();
        this.math = new Subject();
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.korea = new Subject();
        this.math = new Subject();
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + studentAddress);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showTotalScore() {
        int total = korea.score + math.score;
        System.out.println("total: " + total);
    }
}
