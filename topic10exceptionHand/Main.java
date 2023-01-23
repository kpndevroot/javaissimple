package topic10exceptionhand;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,4};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println(e);
         
        }
    

    }
}
// ArthmaticException