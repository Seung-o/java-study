package chapter25;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("AI가 차를 운전합니다.");
    }

    @Override
    public void stop() {
        System.out.println("AI가 차를 멈춥니다.");
    }
}
