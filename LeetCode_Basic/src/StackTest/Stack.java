package StackTest;

public interface Stack<E> {
    void getSize(E e);

    void push();

    boolean isEmpty();

    E pop();
    E peek();

}
