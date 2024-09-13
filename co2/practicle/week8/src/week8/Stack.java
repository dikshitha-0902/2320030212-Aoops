package week8;
public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();  // Additional method to peek at the top element
    boolean isEmpty();  // Check if the stack is empty
}

