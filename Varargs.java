package exercises;

public class Varargs {

    public static void main(String[] args) {

        System.out.print("Varargs sum: " + sumVarargs(10, 5, 10, 5, 20, 5));

    }

    public static int sumVarargs(int x, int y, int... intArrays) {

        int sum = (x + y);
        for (int i : intArrays) {
            sum += i;
        }
        return sum;
    }

}
