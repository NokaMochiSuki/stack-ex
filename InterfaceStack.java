public interface InterfaceStack {
    void push(String item);
    String pop();

    boolean isEmpty(); // true if the stack is empty.
    boolean isFull(); // true if the stack is full.
    String toString();
}
