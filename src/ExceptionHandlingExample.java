import java.util.function.BiConsumer;

public class ExceptionHandlingExample {


    public static void main(String[] args) {
        int[] someArray = {1, 2, 3, 4, 5};
        int key = 0;

        process(someArray,key, wrapperlambda( (i,k) -> System.out.println(i/  k) ));
    }
    private static BiConsumer<Integer,Integer> wrapperlambda(BiConsumer<Integer,Integer> biConsumer) {
        return (i,k) ->{
            try {
                biConsumer.accept(i,k);
            }
            catch (ArithmeticException ae) {
                System.out.println("Arithmetic Exception occured");
            }
        };
    }

    public static void process(int[] someArray, int key, BiConsumer<Integer,Integer> biConsumer) {
        for(int a:someArray) {
            biConsumer.accept(a,key);
        }
    }
}