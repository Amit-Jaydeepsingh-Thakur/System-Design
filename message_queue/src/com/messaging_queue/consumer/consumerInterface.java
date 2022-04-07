package com.messaging_queue.consumer;
import com.messaging_queue.exceptions.tokenNotFoundException;

public interface consumerInterface {
    public Integer getNextToken() throws tokenNotFoundException;
}
