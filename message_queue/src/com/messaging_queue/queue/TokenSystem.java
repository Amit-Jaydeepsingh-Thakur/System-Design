package com.messaging_queue.queue;

import com.messaging_queue.consumer.consumerInterface;
import com.messaging_queue.exceptions.noTokenAvailable;
import com.messaging_queue.exceptions.tokenNotFoundException;
import com.messaging_queue.producer.producerInterface;

import java.util.ArrayList;

public class TokenSystem implements consumerInterface, producerInterface {
    ArrayList<Integer> tokenList = new ArrayList<>();

    @Override
    public boolean addToken(Integer token) throws noTokenAvailable {
        if (!tokenList.contains(token)) {
            tokenList.add(token);
            return true;
        }
        throw new noTokenAvailable("The token is already being taken");
    }

    @Override
    public Integer getNextToken() throws tokenNotFoundException {
        // using the FCFS
        if (tokenList.size() <= 0) {
            throw new tokenNotFoundException("The next token is not available");
        }
        return tokenList.remove(0);
    }
}
