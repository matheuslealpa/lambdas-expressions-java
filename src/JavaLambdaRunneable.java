/**
 * An interface with only one abstract method is
 * called a functional interface,
 * or a Single Abstract Method (SAM) interface.
 *
 * The interface may or may not have the
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
    }
}
