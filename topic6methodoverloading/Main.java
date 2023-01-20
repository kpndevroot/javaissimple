package topic6methodoverloading;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.add(10,20));
        System.out.println( methods.add(1.25,2.25));
        System.out.println( methods.add("add","method"));
    }
}
