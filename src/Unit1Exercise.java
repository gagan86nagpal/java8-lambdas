import com.sun.tools.classfile.ConstantPool;

import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Gagan","Nagpal",21),
                new Person("Shubham","Rustagi",21),
                new Person("Akash","Verma",21),
                new Person("Paritosh","Verma",22),
                new Person("Sagar","Gupta",22),
                new Person("Chirag","Chopra",23),
                new Person("Abhishek","Cing",21)
        );
        Collections.sort(people,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println("LAST NAME SORTING");
        printConditionally(people,p-> true,p-> System.out.println(p));

        System.out.println("LAST NAME STARTING WITH C");
        printConditionally(people,p-> p.getLastName().startsWith("C"),p-> System.out.println(p.getFirstName()));

    }

    static  void printConditionally(List<Person> L, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person person: L) {
            if(predicate.test(person))
             consumer.accept(person);
        }
    }
}
