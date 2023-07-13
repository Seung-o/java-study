package chapter25;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void turnOn(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 껍니다.");
    }

    public final void run() {
        this.turnOn();
        this.drive();
        this.stop();
        this.turnOff();
    }
}
