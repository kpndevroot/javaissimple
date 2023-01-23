package topic4basicclass;
public class Car {
    String Name;
    int number;
    public static void main(String[] args) {
      Car vishnu = new Car();
      Car vaishakh = new Car();
      Car archa = new Car();

// vishnu's car details
      vishnu.Name="ms800";
      vishnu.number=1010;

    //   vaishakh's car deatils
    vaishakh.Name="audi a8";
    
    // archa's car details

    archa.Name="laboghini";


    System.out.println(vishnu.Name);
    System.out.println(vishnu.number);


    System.out.println(vaishakh.Name);

    System.out.println(archa.Name);


    }
}
