package com.kosobutskaya.lambda;

public class Person {
    private final String name;
    private final IBehavior behavior;

    public Person(String name, IBehavior behavior){ // konstructor
        this.name = name;
        this.behavior = behavior;
    }

    public String getName() {
        return name;
    }

    public IBehavior getBehavior() {
        return behavior;
    }

    public int getNick() {
        return 0;
    }
}
