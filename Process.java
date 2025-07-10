import javax.swing.JProgressBar;
import javax.swing.JLabel;

public class Process {
    public int pid;
    public int arrivalTime;
    public int burstTime;
    public int completionTime;
    public int turnaroundTime;
    public int responseTime;
    
    public int queueLevel = 0; // Starts at Q0
    public int usedTime = 0;   // Time used at current queue level
    
    public int remainingTime;   // for SRTF logic
    public boolean started;     // for response time calculation

    // UI components
    public JProgressBar progressBar;
    public JLabel stateLabel;
    String name;

    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;

        this.remainingTime = burstTime; //Initially full burst time
        this.started = false;           //Will become true when first executed
        
        this.name = "P" + pid;
    }

    public String getName() {
        return "P" + pid;
    }
    
    
}
