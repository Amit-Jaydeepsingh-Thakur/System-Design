package com.lru.models;

public class CacheElement<Key, Value> {
    Key key;
    Value val;

    public CacheElement(Key key, Value val) {
        this.key = key;
        this.val = val;
    }
}
