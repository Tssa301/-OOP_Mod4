package exercises.charSequenceTokio;

public class ProgramCharSequenceTokio {

    public static void main(String[] args) {

        String str = "Tokio School";
        char[] charObjArray  = str.toCharArray();

        CharSequenceTokio cstArray = new ArrayCharSequenceTokio(charObjArray);
        System.out.println("Length: " + cstArray.length());
        System.out.println("Char at: " + cstArray.charAt(3));
        System.out.println("Subsequence: " + cstArray.subSequence(2,5));
        System.out.println("Char sequence array: " + cstArray.toString());

        System.out.println();

        CharSequenceTokio cstString = new BackwardsStringSequenceTokio("Tokio School");
        System.out.println("Length: " + cstString.length());
        System.out.println("Char at: " + cstString.charAt(3));
        System.out.println("Subsequence: " + cstString.subSequence(0,5));
        System.out.println("Char sequence Backwards: " + cstString.toString());
    }
}
