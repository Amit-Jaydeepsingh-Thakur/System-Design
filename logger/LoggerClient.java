package logger;

import java.util.*;
import java.io.*;

class Process {
    private final String processID;
    private final long startTime;
    private long endTime;
    
    Process(String processID, long startTime) {
        this.processID = processID;
        this.startTime = startTime;
        this.endTime = -1;
    }

    public void setEndTime(long time) {
        this.endTime = time;
    }

    public String getProcessID() {
        return this.processID;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
}



class LoggerClient {
    public static void main(String[] args) {

    }
}