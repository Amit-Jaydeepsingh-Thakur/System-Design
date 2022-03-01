package main.java.com.amitthakur.algorithms;

public class DoublyLinkedList<E> {
    public DoublyLinkedListNode<E> head;
    public DoublyLinkedListNode<E> tail;

    public DoublyLinkedList() {
        head = new DoublyLinkedListNode<>(null);
        tail = new DoublyLinkedListNode<>(null);

        head.next = tail;
        tail.prev = head;
    }

    public E getElement(DoublyLinkedListNode<E> node) {
        return node.element;
    }

    public void insertLast(DoublyLinkedListNode<E> node) {
        if (node != null) {
            DoublyLinkedListNode<E> tailprev = tail.prev;
            tailprev.next = node;
            node.prev = tailprev;
            node.next = tail;
            tail.prev = node;
        }
    }

    public DoublyLinkedListNode<E> getFirst() {
        if (head.next != null) {
            return head.next;
        }
        else {
            return null;
        }
    }

    public void detachNode(DoublyLinkedListNode<E> node) {
        if (node != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
}
