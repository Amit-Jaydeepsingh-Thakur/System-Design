package main.java.com.amitthakur.algorithms;

public class DoublyLinkedListNode<E> {
    DoublyLinkedListNode<E> prev;
    DoublyLinkedListNode<E> next;
    E element;
    public DoublyLinkedListNode(E element) {
        prev = null;
        next = null;
        this.element = element;
    }
}
