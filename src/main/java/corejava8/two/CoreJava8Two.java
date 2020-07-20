package corejava8.two;

import corejava8.two.impl.RunSAMCallImpl;
import corejava8.two.impl.ThanoojNokia7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CoreJava8Two {
    public static void main(String[] args) {
        ThanoojNokia7 thanoojNokia7 = new ThanoojNokia7();
        System.out.println(thanoojNokia7);
        runPredicate();
        runRunnable();
        List<RunSAMCallImpl> runSAMCallImplList = new ArrayList<>();
        runSAMCallImplList.add(new RunSAMCallImpl());
        runSAMCallImplList.add(new RunSAMCallImpl());
        runSAMCallImplList.add(new RunSAMCallImpl());
       // TODO how to run SAM method in lambda expressions
        // String str = runSAMCallImplList.forEach(() -> return "" ;);
    }

    private static void runPredicate() {
        // create a list of strings
        List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("G");
        // Iterate through the list
        for (String st : names) {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
    }

    private static void runRunnable() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
            }
        }).start();

        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
    }
}
