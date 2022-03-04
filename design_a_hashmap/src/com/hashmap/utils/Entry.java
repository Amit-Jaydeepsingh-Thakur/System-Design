package com.hashmap.utils;

public class Entry<Key, Value> {
    public Key key;
    public Value val;
    public Entry<Key, Value> next;

    public Entry(Key key, Value val, Entry<Key, Value> next) {
        this.key = key;
        this.val = val;
        this.next = next;
    }

    public Entry(Key key, Value val) {
        this.key = key;
        this.val = val;
        this.next = next;
    }
}
