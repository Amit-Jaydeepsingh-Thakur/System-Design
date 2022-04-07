package com.messaging_queue.consumer;

import java.util.*;

import com.messaging_queue.exceptions.tokenNotFoundException;
import com.messaging_queue.queue.TokenSystem;
import com.messaging_queue.consumer.consumerInterface;
import com.messaging_queue.producer.producerInterface;

public class Consumer {
    Set<Integer> tokenProcessed = new HashSet<>();

    public void processNextToken() throws tokenNotFoundException {
        consumerInterface ci = new TokenSystem();
        Integer token = ci.getNextToken();

        if (!tokenProcessed.contains(token)) {
            tokenProcessed.add(token);
        }

        throw new tokenNotFoundException("No Token available to process");
    }
}
