public abstract class AbstractStack {
    public abstract void push(String item);
    public abstract String pop();

    public abstract boolean isEmpty(); // true if the stack is empty.
    public abstract boolean isFull(); // true if the stack is full.
    public abstract String toString();
}
