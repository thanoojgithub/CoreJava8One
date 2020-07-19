package corejava8.two.impl;

import corejava8.two.Nokia7;

public class ThanoojNokia7 implements Nokia7 {

    @Override
    public String profile() {
        System.out.println("Thanooj");
        return "Thanooj";
    }

    @Override
    public String toString() {
        return (profile() + " | " + model() + " | " + color() + " |" + specs() + " | " + brand());// TODO
    }
}
