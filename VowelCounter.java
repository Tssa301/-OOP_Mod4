package exercises;

public class VowelCounter {

    public static void main(String[] args) {

        String value = "A abelha e feroz";
        // String value = "AeIoU";
        // String value = "A abelha é feroz?";

        System.out.println(value);
        VowelCnt(value);

    }

    public static int VowelCnt(String value) {
        value = value.toLowerCase().replaceAll("\\s", "");
        char vowel[] = value.toCharArray();
        int vowcnt = 0;
        int i = 0;

        while (i != vowel.length) {

            // Scrolling through the entire alphabet
            if (vowel[i] >= 'a' && vowel[i] <= 'z') {

                if (vowel[i] == 'a' || vowel[i] == 'e' || vowel[i] == 'i' || vowel[i] == 'o' || vowel[i] == 'u') {
                    vowcnt++;
                }
            }
            i++;
        }

        System.out.println("\nVowel counter = " + vowcnt);

        return 0;
    }
}