import java.util.Arrays;

public class Stack {
    int size;

    int top;
    int [] array;

    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];// process of adding an item to a stack is called push
    }
    boolean isFull() {
        return (top == size - 1);
    }
    boolean isEmpty() {
        return (top == -1);
    }
    void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        }else {
            array[top + 1] = item;
            top++;
        }
    }
    int pop() {
        int previousTop = top;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }else {
            top--;
        }
        return  array[previousTop];

    }
    void printAll() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }

}
