package topic10exceptionhand;

import javax.lang.model.util.ElementScanner14;

public class Throwing {
    static void validate(int age){
            if(age<18){
                throw new ArithmeticException();
            }
            else{
                throw new ArrayIndexOutOfBoundsException();
            }
    }

    void mymethod (int num) throws ArithmeticException,ArrayIndexOutOfBoundsException,ClassNotFoundException{
       if(num>5){
        throw new ArrayIndexOutOfBoundsException();
       }
       else{
        throw new ClassNotFoundException();
       }
    }

    public static void main(String[] args) {
        validate(16);
        try {
            Throwing T = new Throwing();
            T.mymethod(6);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
