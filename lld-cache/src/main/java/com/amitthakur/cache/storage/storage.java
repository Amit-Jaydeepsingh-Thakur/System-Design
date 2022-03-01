package main.java.com.amitthakur.cache.storage;

public interface storage<Key, Value> {
    void add(Key key, Value val);
    void remove(Key key);
    Value get(Key key);
}
