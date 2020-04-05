package com.kosobutskaya.hw5.garage;

public class Lock {
    private Key key;

    public Lock (){     //конструктор
        key = new Key();
    }

    public boolean open (Key key) {
        return this.key.equals(key);
    }

    public boolean close (Key key){
        return this.key.equals(key);
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }
}
