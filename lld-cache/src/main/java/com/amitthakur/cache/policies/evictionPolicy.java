package main.java.com.amitthakur.cache.policies;

public interface evictionPolicy<Key> {
    void keyAccessed(Key key);
    Key evictKey();
}
