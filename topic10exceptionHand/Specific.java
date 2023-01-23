package topic10exceptionhand;

public class Specific {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,4};
            System.out.println(numbers[1]);
            int result=2/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enter a valid index between 0-2");
          
        }
        catch(ArithmeticException A) {
            System.out.println("number cannot be div by 0");
        }
        catch(Exception e) {
            System.out.println("expcption is"+e);
        }
    

    }
}
