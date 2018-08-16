public class ClosuresExample {

    public static void main(String[] args) {
        int b = 10;
        doProcess(12,x-> System.out.println(x+b));
    }

    public static void doProcess(int a,Process p) {

        p.doProcess(a);
    }
}

interface Process {
    void doProcess(int i);
}
