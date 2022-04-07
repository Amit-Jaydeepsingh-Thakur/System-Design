package com.messaging_queue.producer;

import java.util.*;

import com.messaging_queue.exceptions.noTokenAvailable;
import com.messaging_queue.producer.producerInterface;
import com.messaging_queue.consumer.consumerInterface;
import com.messaging_queue.queue.TokenSystem;

public class Producer {
    Integer TOKEN_LIMIT = 1000;
    Set<Integer> cache = new HashSet<>(TOKEN_LIMIT);

    public boolean addNextToken(Integer token) throws noTokenAvailable {
        producerInterface pi = new TokenSystem();
        pi.addToken(token);
        cache.add(token);
        return true;
    }

    public Integer getToken() {
        for (int i = 1; i <= TOKEN_LIMIT; i++) {
            if (cache.contains(i)) {
                return i;
            }
        }

        return null;
    }
}
