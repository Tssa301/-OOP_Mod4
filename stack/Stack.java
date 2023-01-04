package exercises.stack;

public class Stack {

    int[] myStack = new int[5];
    int top = 0;

    public void push(int value) {

        myStack[top] = value;
        top++;
    }

    public int pop() {
        int value;
        top--;

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
