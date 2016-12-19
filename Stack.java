abstract class AbstractStack {
    public abstract void push(String item);
    public abstract String pop();

    public abstract boolean isEmpty(); // true if the stack is empty.
    public abstract boolean isFull(); // true if the stack is full.
    public abstract String toString();
}

interface InterfaceStack {
    void push(String item);
    String pop();

    boolean isEmpty(); // true if the stack is empty.
    boolean isFull(); // true if the stack is full.
    String toString();
}