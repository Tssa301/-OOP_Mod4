package exercises;

//Monomers - letters of the alphabet, from “A” to “Z” (not counting “N”).
//Capital letter - positive polarity
//Lower case - negative polarity.

public class Polymers {
    public static void main(String[] args) {

        System.out.println("The Polymer 'CaAdbb' is " + monomersPolymer("CaAdbb"));
        System.out.println("The Polymer 'rFvdAaDVb' is " + monomersPolymer("rFvdAaDVb"));

    }

    public static String monomersPolymer(String polymer) {

        int x = 0;
        String poly = "";

        while (x < polymer.length() - 1) {

            if (polymer.toLowerCase().charAt(x) == polymer.charAt(x + 1)
                    || polymer.charAt(x) == polymer.toLowerCase().charAt(x + 1)) {
                if (polymer.charAt(x) != polymer.charAt(x + 1)) {

                    if (x > 0) {
                        poly = polymer.substring(0, x);
                    }

                    if (x + 2 <= polymer.length() - 1) {
                        poly += polymer.substring(x + 2);
                    }

                    polymer = poly;

                    if (x > 0) {
                        x--;
                    }
                } else {
                    x++;
                }
            } else {
                x++;
            }

        }
        return polymer;
    }
}
