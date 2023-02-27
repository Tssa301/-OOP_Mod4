package exercises.stack;

import exercises.stack.exceptions.StackEmptyException;
import exercises.stack.exceptions.StackFullException;

public class Stack {

    int[] myStack = new int[3];
    int top = 0;

    public Stack() {
    }

    //adds an element to the top of the stack.
    public void push(int value) throws StackFullException {

        if (top >= myStack.length){
            throw new StackFullException();
        }
        myStack[top] = value;
        top++;
    }

    //removes and returns the top element from the stack.
    public int pop() throws StackEmptyException {
        int value;
        top--;

        if (top == -1){
            throw new StackEmptyException();
        }
        value = myStack[top];
        myStack[top] = 0;
        return value;
    }

    public void showStack() {

        for (int data : myStack) {
            System.out.print(data + " ");
        }
    }
}
