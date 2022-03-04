package com.lru.models;

import com.lru.models.CacheElement;

public class LinkedListNode<Key, Value> {
    CacheElement<Key, Value> ele;
    LinkedListNode next;
    LinkedListNode prev;

    public LinkedListNode(CacheElement<Key, Value> ele) {
        this.ele = ele;
        this.next = null;
        this.prev = null;
    }

    public Key getKey() {
        return this.ele.key;
    }

    public Value getValue() {
        return this.ele.val;
    }

}
