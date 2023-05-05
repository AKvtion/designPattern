package proxyMode;

import java.util.Hashtable;

public class FlyweightFactory {
    private Hashtable<String, FlyWeight> flyweights = new Hashtable<String, FlyWeight>();

    public FlyWeight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            FlyWeight flyweight = null;
            if (key.equals("black")) {
                flyweight = new BlackFlyWeight();
            } else if (key.equals("white")) {
                flyweight = new WhiteFlyWeight();
            }
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }
}
