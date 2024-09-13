package week8;
import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;  // Indicates the stack is initially empty
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Resizing the stack...");
            resize();
        }
        stack[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        stack = Arrays.copyOf(stack, capacity);
    }
}

