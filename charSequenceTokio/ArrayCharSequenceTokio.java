package exercises.charSequenceTokio;

import java.util.Arrays;

public class ArrayCharSequenceTokio implements CharSequenceTokio {

    private final char[] charArray;

    public ArrayCharSequenceTokio(char[] charArray) {
        this.charArray = charArray;
    }

    @Override
    public int length() {
        return this.charArray.length;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index > charArray.length){
            return 0;
        }
        return charArray[index];
    }

    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        if(start == end ){
            return new ArrayCharSequenceTokio(new char[0]);
        }
        else if (start < 0 || end > charArray.length || start > end){
            return null;

        }
        return new ArrayCharSequenceTokio(Arrays.copyOfRange(charArray, start, end));
    }

    @Override
    public String toString() {
        return  Arrays.toString(charArray);
    }
}
