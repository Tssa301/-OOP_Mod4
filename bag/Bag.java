package exercises.bag;

import java.util.ArrayList;
import java.util.Random;

public class Bag {
    private final ArrayList<String> items;
    private final Random rand;

    public Bag() {
        items = new ArrayList<String>();
        rand = new Random();
    }

    public void putInBag(String item) {
        items.add(item);
    }

    /*
     * This method first checks whether the bag is empty or not,
     * then uses the nextInt() method to generate a random value
     * returned from it and removes.
     */
    public String takeFromBag() {
        int obj;
        if (items.size() > 0) {
            obj = rand.nextInt(items.size());
            return items.remove(obj);
        } else {
            return null;
        }
    }
}
