package logger;

import java.util.*;

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
class Logger implements loggerInterface {
    Map<String, Process> processes = new HashMap<>();
    TreeMap<Long, Process> queue = new TreeMap<>();

    public Logger() {
        this.processes = new HashMap<>();
        this.queue = new TreeMap<>();
    }

    public boolean startProcess(String processID) {
        System.out.println("Starting" + " " + processID);
        final long now = System.currentTimeMillis();
        final Process process = new Process(processID, now);
        processes.put(processID, process);
        queue.put(now, process);

        return true;
    }

    public boolean endProcess(String processID) {
        final long now = System.currentTimeMillis();
        processes.get(processID).setEndTime(now);
        return true;
    }

    public void pollProcess() {
        if (queue.isEmpty()) {
            System.out.println("No Processes");
            return;
        }

        final Process process = queue.firstEntry().getValue();

        if (process.getEndTime() != -1) {
            System.out.println("The given process with the process ID started at " + process.getProcessID() + " " + process.getStartTime() + " and it ended at " + process.getEndTime());
            queue.pollFirstEntry();
            processes.remove(process.getProcessID());
        }
        else {
            System.out.println("No End Time for the " + process.getProcessID());
        }
    }
}


class LoggerClient {
    public static void main(String[] args) {
        final Logger logger = new Logger();
        System.out.println("======= Starting the Process Logger ===========");

        logger.startProcess("1");
        logger.pollProcess();
        logger.startProcess("3");
        logger.pollProcess();
        logger.endProcess("1");
        logger.pollProcess();
        logger.startProcess("2");
        logger.pollProcess();
        logger.endProcess("2");
        logger.pollProcess();
        logger.endProcess("3");
        logger.pollProcess();
        logger.pollProcess();
        logger.pollProcess();

        System.out.println("============ Completed the Logging ======================");
    }
}