package com.lru.cache;

import java.util.*;


import com.lru.models.LinkedListNode;
import com.lru.models.CacheElement;
import com.lru.models.LinkedList;

public class LRUCache<Key, Value> implements Cache {

    Map<Key, LinkedListNode<Key, Value>> map;
    LinkedList list;

    public LRUCache() {
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
    }

    public boolean put(Key key, Value val) {
        if (!map.containsKey(key)) {
            CacheElement<Key, Value> cacheEle = new CacheElement<>(key, val);
            LinkedListNode<Key, Value> node = new LinkedListNode<>(cacheEle);
            map.put(key, node);
            list.addHead(cacheEle);

            return true;
        }
        else {
            LinkedListNode<Key, Value> node = map.get(key);
            Key cacheKey = node.getKey();
            Value cacheVal = node.getValue();
            CacheElement<Key, Value> cacheEle = new CacheElement<>(cacheKey, cacheVal);
            LinkedListNode<Key, Value> curr = new LinkedListNode<>(cacheEle);
            this.list.getNode(curr);
            return true;
        }
    }

    public LinkedListNode<Key, Value> get(Key key) {
        if (!map.containsKey(key)) {
            return null;
        }
        else {
            return map.get(key);
        }
    }

    public Key getLRU() {
        LinkedListNode<Key, Value> node = list.getLastNode();
        return node.getKey();
    }

    @Override
    public int getSize() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return (map.size() == 0 ? true : false);
    }
}
