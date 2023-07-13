package chapter25;

public class CarTest {

    public static void main(String[] args) {
        Car manualCar = new ManualCar();
        Car aiCar = new AICar();

        manualCar.run();
        aiCar.run();
    }
}
