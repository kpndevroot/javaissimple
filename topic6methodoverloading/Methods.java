package topic6methodoverloading;
// multiple methods can have the same name with different parameters.
public class Methods {
    int add (int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
}
