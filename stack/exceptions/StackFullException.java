package exercises.stack.exceptions;

public class StackFullException extends Exception {

    public StackFullException(){
        super("The stack is full!");
    }
}
