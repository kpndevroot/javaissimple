package topic4b;

public class MainClass {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.name = "bmw";
        car2.name = "audi";
        System.out.println(car1.name);
        System.out.println(car2.name);
        car1.wheels();
    }
}
