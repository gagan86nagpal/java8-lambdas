public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform(String s) {
        System.out.println(s);
    }
}
