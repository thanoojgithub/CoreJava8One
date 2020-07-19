package corejava8.two;

import corejava8.two.SmartPhone;

public interface Nokia7 extends SmartPhone {

    default String color(){
        System.out.println("WHITE");
        return "WHITE";
    }

    default String model(){
        System.out.println("Nokia7.1");
        return "Nokia7.1";
    }
    default String specs(){
        System.out.println("All spec details");
        return "All spec details";
    }
}
