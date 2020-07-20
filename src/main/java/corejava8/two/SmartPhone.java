package corejava8.two;

/**
 * FunctionalInterface:
 * 1. A functional interface is an interface that contains only one abstract method
 * 2. It can have 1 or more default methods
 * 3. It can have 1 or more static default methods
 * 4. Example : Runnable, ActionListener, Comparable
 * 5. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
 * 6. The java.util.function package in Java 8 contains many builtin functional interfaces like-
 * Predicate, BinaryOperator, Function
 * 7. Default methods are used to enable the functionality of lambda expression in java
 * 8. Lambda expression are essentially of type of functional interface.
 * 9. To support lambda expressions seamlessly, all core classes have to be modified.
 *    But these core classes like java.util.List are implemented not only in JDK classes,
 *    but also in thousands of client code as well.
 *    Any incompatible change in core classes will back fire for sure and will not be accepted at all.
 *    Default methods break this deadlock and allow adding support for functional interface.
 * 10.
 */
@FunctionalInterface
public interface SmartPhone {

    public String profile();

    @Override
    public String toString();


    default String brand() {
        System.out.println("brand");
        return "Nokia";
    }
}
