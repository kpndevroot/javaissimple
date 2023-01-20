package topic10exceptionHand;

public class Specific {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,4};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter a valid index between 0-2");
          
        }
        catch(Exception e) {
            System.out.println(e);
        }
    

    }
}
