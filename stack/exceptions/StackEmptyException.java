package exercises.stack.exceptions;

public class StackEmptyException extends Exception {

    public StackEmptyException(){
        super("The stack is empty!");
    }
}
