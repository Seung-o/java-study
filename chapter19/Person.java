package chapter19;

public class Person {

    private final String name;
    private final int age;

    public Person() {
        this("이름 없음", -1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.age);

        System.out.println(person.getPerson());
    }

    public Person getPerson() {
        return this;
    }
}
