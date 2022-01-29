package logger;

public interface loggerInterface {
    public boolean startProcess(String processID);
    public boolean endProcess(String processID, long time);
    public void pollProcess();
}
