package exercises.stack;

import exercises.stack.exceptions.StackEmptyException;
import exercises.stack.exceptions.StackFullException;

public class ProgramStack {

    /*
     * Stack => LIFO - Last in First out.
     * Push = add
     * Pop = delete
     */

    public static void main(String[] args) {

        Stack myStack = new Stack();

        try {
            myStack.push(15);
            myStack.push(8);
            myStack.push(10);
            //myStack.push(13);


            myStack.pop();
            myStack.pop();
            //myStack.pop();


            System.out.print("My Stack: ");
            myStack.showStack();

            //Print the deleted value
            System.out.println("\nLast in, First out: " + myStack.pop());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println("\nMessage: " + e.getMessage());
        }
    }
}