package topic3forloop;
public class ForLoop {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i < array.length; i++) {
            System.out.println("from ordinary element = "+array[i]);
        }
        for(int i:array ){
            System.out.println("refined element ="+i);
        }
    }
}
