public class ThisReferenceExample {

    public void doProcess(int i, Process process) {
        process.doProcess(i);
    }

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();


        thisReferenceExample.doProcess(10, i-> {
            System.out.println("i: " + i);
            //System.out.println(this);
            //cannot use this from a static context
            // Value of this in a lambda expression is same as outside lambda
        });
        thisReferenceExample.doProcess(10, new Process() {
            public void doProcess(int i) {
                System.out.println("i: "+ i);
                System.out.println(this);
            }
        });
    }
}
