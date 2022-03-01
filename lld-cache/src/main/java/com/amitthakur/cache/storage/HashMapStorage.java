package main.java.com.amitthakur.cache.storage;

import java.util.HashMap;
import java.util.Map;

public class HashMapStorage<Key, Value> implements storage<Key, Value> {

    public Map<Key, Value> storage;
    private final int capacity;

    public HashMapStorage(Integer capacity) {
        storage = new HashMap<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Key key, Value val) {
        storage.put(key, val);
        return;
    }

    @Override
    public void remove(Key key) {
        storage.remove(key);
    }

    @Override
    public Value get(Key key) {
        return storage.get(key);
    }

    public boolean isStorageFull() {
        if (storage.size() == capacity) {
            return true;
        }

        return false;
    }
}
