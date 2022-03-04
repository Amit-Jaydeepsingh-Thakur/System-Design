package com.lru.models;

public class LinkedList<Key, Value> {
    LinkedListNode head;
    LinkedListNode tail;

    public LinkedList() {
        head = new LinkedListNode(new CacheElement(0, 0));
        tail = new LinkedListNode(new CacheElement(0, 0));
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        head.prev = null;
    }

    public void addHead(CacheElement<Key, Value> ele) {
        LinkedListNode<Key, Value> node = new LinkedListNode<>(ele);
        LinkedListNode<Key, Value> curr = head.next;
        head.next = node;
        node.prev = head;
        node.next = curr;
        curr.prev = node;
        return;
    }

    public void addTail(CacheElement<Key, Value> ele) {
        LinkedListNode<Key, Value> node = new LinkedListNode<>(ele);
        LinkedListNode<Key, Value> curr = tail.prev;
        curr.next = node;
        node.next = tail;
        node.prev = curr;
        tail.prev = node;
        tail.next = null;

        return;
    }

    public LinkedListNode<Key, Value> getLastNode() {
        return tail.prev;
    }

    public LinkedListNode getNode(LinkedListNode<Key, Value> ele) {
        LinkedListNode<Key, Value> curr = head;

        while (curr != null) {
            if (curr.equals(ele)) {
                Key key = ele.getKey();
                Value val = ele.getValue();

                CacheElement<Key, Value> cacheEle = new CacheElement<>(key, val);

                addHead(cacheEle);
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;

                return curr;
            }
            curr = curr.next;
        }

        return null;
    }




}
