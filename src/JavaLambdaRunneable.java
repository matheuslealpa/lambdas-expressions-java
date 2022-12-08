import java.util.List;
import java.util.Arrays;

/**
 * An interface with only one abstract method is
 * called a functional interface,
 * or a Single Abstract Method (SAM) interface.
 * <p>
 * The interface may or may not have the
 *
 * @FunctionalInterface Annotation
 */
public class JavaLambdaRunneable {
    public static void main(String[] args) {

        // Java 7
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world - Java 7");
            }
        }).run();

        // Java 8 - Lambdas Expressions
        new Thread(() -> System.out.println("Hello world - Lambdas Expressions")).run();

        // Example stream API
        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);

        listNum.stream().filter(e -> ((e % 2) != 0))
                .forEach(e -> System.out.println(e));

        listNum.stream()
                .forEach((e) -> System.out.println(e));

        listNum.stream()
                .filter(e -> (e <= 5))
                .forEach(e -> System.out.println(e));

        listNum.stream()
                .skip(2) // ignores the first two elements
                .forEach(e -> System.out.println(e));

        listNum.stream()
                .limit(2) // processes the first two elements
                .forEach(e -> System.out.println(e));

        listNum.stream()
                .distinct() // ignore equal elements. equals and hashcode
                .forEach(e -> System.out.println(e));
    }
}
