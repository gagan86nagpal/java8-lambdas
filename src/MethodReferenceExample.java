public class MethodReferenceExample {
    public static void main(String[] args) {
        Thread t = new Thread(()-> print());
        t.start();

        t = new Thread(MethodReferenceExample::print);
        t.start();

        // ()-> print() === MethodReferenceExample::print
    }

    public static void print() {
        System.out.println("HEllo");
    }
}
