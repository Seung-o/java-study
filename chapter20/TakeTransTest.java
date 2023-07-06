package chapter20;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentHa = new Student("Ha", 5000);
        Student studentO = new Student("O", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        studentHa.takeBus(bus100);
        studentO.takeSubway(subwayGreen);

        studentHa.showStudentInfo();
        studentO.showStudentInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
    }
}
