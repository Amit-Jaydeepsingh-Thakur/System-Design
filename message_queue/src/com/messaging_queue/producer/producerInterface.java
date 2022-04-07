package com.messaging_queue.producer;
import com.messaging_queue.exceptions.noTokenAvailable;

public interface producerInterface {
    public boolean addToken(Integer token) throws noTokenAvailable;
}
