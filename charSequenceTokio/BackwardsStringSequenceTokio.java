package exercises.charSequenceTokio;

public class BackwardsStringSequenceTokio implements CharSequenceTokio {

    private final String str;

    public BackwardsStringSequenceTokio(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index > str.length()){
            return 0;
        }
        return str.charAt(str.length() - 1 - index);
    }

    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        if(start == end ){
            return new BackwardsStringSequenceTokio("' '");
        }
        else if (start < 0 || end > str.length() || start > end){
            return null;
        }
        return new BackwardsStringSequenceTokio(str.substring(str.length() - end, str.length() - start));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
