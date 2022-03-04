package com.hashmap.storage;

import com.hashmap.utils.Entry;
import com.hashmap.exceptions.noElementFoundException;

public class HashMap<Key, Value> {
    private static int capacity = 16;
    Entry<Key, Value>[] hashTable;

    public HashMap() {
        this.hashTable = new Entry[capacity];
    }

    public HashMap(int capacity) {
        this.capacity = capacity;
        this.hashTable = new Entry[capacity];
    }

    public int getHash(Key key) {
        return (Math.abs(key.hashCode() % capacity));
    }

    public void put(Key key, Value value) {
        if (key == null) {
            return;
        }

        int hash = getHash(key);
        Entry<Key, Value> newEntry = new Entry(key, value);

        if (hashTable[hash] == null) {
            hashTable[hash] = newEntry;
            return;
        }
        else {
            Entry<Key, Value> curr = hashTable[hash];
            Entry<Key, Value> prev = null;

            while (curr != null) {
                if (curr.key.equals(key)) {
                    curr.val = newEntry.val;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr;
        }
    }

    public Value get(Key key) throws noElementFoundException {
        if (key == null) {
            throw new noElementFoundException("The Element is not found in the HashMap");
        }

        int hash = getHash(key);

        Entry<Key, Value> curr = hashTable[hash];

        if (curr == null) {
            throw new noElementFoundException("The Element is not found in the HashMap");
        }

        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.val;
            }
            curr = curr.next;
        }

        return null;
    }
}
