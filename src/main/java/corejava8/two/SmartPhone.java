package corejava8.two;

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
