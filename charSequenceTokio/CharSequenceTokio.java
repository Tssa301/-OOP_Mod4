package exercises.charSequenceTokio;

public interface CharSequenceTokio {

    //Interface CharSequence
    //https://docs.oracle.com/javase/8/docs/api/index.html?java/lang/CharSequence.html

    int length();

    char charAt(int index);

    CharSequenceTokio subSequence(int start, int end);

    public String toString();


}
