import com.lru.cache.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("My LRU Cache");

        LRUCache cache = new LRUCache();
        cache.put(1, 1);
        cache.put(2,2);
        cache.put(3,2);

        System.out.println(cache.getLRU());
    }
}
