package topic2ternary;
public class Ternary {
    
    public static void main(String[] args) {
        int a =1;
        int b=2;
        int result;
        if(a>b){
          
           result=a;
        }
        else{
            result=b;
        }
        System.out.println("if result " + result);
        result = (a>b) ?  a :  b;
        System.out.println("ternary result " +result); 
    }
}
