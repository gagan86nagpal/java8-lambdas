public class Greeter {


    void greet(Greeting greeting) {
        greeting.perform("Hello Word");

    }

    public static void main(String[] args) {
        Greeting lambdaGreeting = s-> System.out.println(s);
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform(String s) {
                System.out.println(s);
            }
        };
        Greeter greeter = new Greeter();
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
        giveLength(s->s.length());
        Thread myInnerClassThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside anonymous inner class ");
            }
        });
        Thread myLambdaThread = new Thread(()-> System.out.println("Inside lambda "));
        myInnerClassThread.start();
        myLambdaThread .start();
    }


    public static void giveLength(StringLengthLambda l) {
        System.out.println(l.getLength("Hello Lambda!"));
    }
}



