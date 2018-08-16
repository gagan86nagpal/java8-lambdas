import java.util.function.BiConsumer;

public class ExceptionHandlingExample {


    public static void main(String[] args) {
        int [] someArray ={1,2,3,4,5};
        int key = 2;
        process(someArray,key,(i,k) -> System.out.print(i/k+ " "));
    }

    public static void process(int[] someArray, int key, BiConsumer<Integer,Integer> biConsumer) {
        for(int a:someArray) {
            biConsumer.accept(a,key);
        }
    }
}