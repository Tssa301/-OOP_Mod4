package exercises.bag;

import java.util.List;

public class programBag {

    public static void main(String[] args) {

        Bag myBag = new Bag();

        // It loops through the getItems() List and puts it in the Bag.
        for (String item : getItems()) {
            myBag.putInBag(item);
        }

        // Brings a random item from the bag.
        System.out.println("Taken item: " + myBag.takeFromBag());

    }

    private static List<String> getItems() {
        return List.of(
                "Pen",
                "Book",
                "Laptop",
                "Power-bank",
                "Keys");
    }
}
