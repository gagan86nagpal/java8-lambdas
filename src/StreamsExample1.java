import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Gagan", "Nagpal", 21),
                new Person("Shubham", "Rustagi", 21),
                new Person("Akash", "Verma", 21),
                new Person("Paritosh", "Verma", 22),
                new Person("Sagar", "Gupta", 22),
                new Person("Chirag", "Chopra", 23),
                new Person("Abhishek", "Cing", 21)
        );

        people.stream()
                .filter(p-> p.getLastName().startsWith("V"))
                .forEach(p-> System.out.println(p));

        System.out.println(people.stream().filter(p->p.getLastName().startsWith("C")).count());
    }
}
