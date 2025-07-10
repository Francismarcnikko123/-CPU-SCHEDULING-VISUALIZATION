import javax.swing.JProgressBar;
import javax.swing.JLabel;

public class Process {
    public int pid;
    public int arrivalTime;
    public int burstTime;
    public int completionTime;
    public int turnaroundTime;
    public int responseTime;
    public int currentQueueLevel = 0; // Start in Q0


    public int remainingTime;   // for SRTF logic
    public boolean started;     // for response time calculation

    // UI components
    public JProgressBar progressBar;
    public JLabel stateLabel;

    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;

        this.remainingTime = burstTime; //Initially full burst time
        this.started = false;           //Will become true when first executed
    }

    public String getName() {
        return "P" + pid;
    }
}
