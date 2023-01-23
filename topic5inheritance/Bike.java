package topic5inheritance;

public class Bike extends Vechicle {
    String Brand;
    int price;
    public void addBike(String brand, int price,String brake, String gear) {
        this.Brand=brand;
        this.price=price;
        this.brake=brake;
        this.gear=gear;
        System.out.println("Bike");
        System.out.println("Brand "+ Brand);
        System.out.println("Price " + price);
        System.out.println("Brake " + brake);
        System.out.println("gear "+ gear);



    }
}
