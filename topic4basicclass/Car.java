package topic4basicclass;
public class Car {
    String Name;
    public static void main(String[] args) {
        Car car = new Car();
        Car car2= new Car();
        car.Name="bmw";
        car2.Name="Audi";
        System.out.println(car.Name);
        System.out.println(car2.Name);

    }
}
