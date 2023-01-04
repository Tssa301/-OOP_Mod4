package exercises.stack;

public class ProgramStack {

    /*
     * Stack => LIFO - Last in First out.
     * Features:
     * Push = add
     * Pop = delete
     */

    public static void main(String[] args) {

        Stack myStack = new Stack();

        // Add value
        myStack.push(15);
        myStack.push(8);
        myStack.push(10);

        // Delete value
        System.out.println(myStack.pop());

        myStack.showStack();

    }
}