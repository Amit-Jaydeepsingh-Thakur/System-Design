package main.java.com.amitthakur.cache.policies;

import main.java.com.amitthakur.algorithms.DoublyLinkedList;
import main.java.com.amitthakur.algorithms.DoublyLinkedListNode;
import java.util.*;

public class LRUEvictionPolicy<Key> implements evictionPolicy<Key> {
    private DoublyLinkedList<Key> dll;
    private Map<Key, DoublyLinkedListNode> map;

    public LRUEvictionPolicy() {
        this.dll = new DoublyLinkedList<>();
        this.map = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        if (map.containsKey(key)) {
            dll.detachNode(map.get(key));
            dll.insertLast(map.get(key));
        }
        else {
            DoublyLinkedListNode<Key> node = dll.insertLast(key);
            map.put(key, node);
        }
    }

    @Override
    public Key evictKey() {
        DoublyLinkedListNode<Key> first = dll.getFirst();
        dll.detachNode(first);
        return dll.getElement(first);
    }
}
