package topic5inheritance;

public class Car extends Vechicle {
    String Brand;
    int price;

    public void addCar(String brand, int price,String brake, String gear) {
        this.Brand=brand;
        this.price=price;
        this.brake=brake;
        this.gear=gear;
        System.out.println("Car");
        System.out.println("Brand "+ brand);
        System.out.println("Price " + price);
        System.out.println("Brake " + brake);
        System.out.println("Gear "+ gear);



    }
}
