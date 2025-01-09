import java.util.List;

public class SRTF {
    public void schedule(List<Process> processes) {
        int currentTime = 0;
        int completed = 0;
        int n = processes.size();

        while (completed < n) {
            Process currentProcess = null;

            // Find the process with the shortest remaining time
            for (Process process : processes) {
                if (process.getArrivalTime() <= currentTime && process.getRemainingTime() > 0) {
                    if (currentProcess == null || process.getRemainingTime() < currentProcess.getRemainingTime()) {
                        currentProcess = process;
                    }
                }
            }

            if (currentProcess == null) {
                currentTime++;
            } else {
                currentProcess.setRemainingTime(currentProcess.getRemainingTime() - 1);
                currentTime++;

                if (currentProcess.getRemainingTime() == 0) {
                    completed++;
                    currentProcess.setCompletionTime(currentTime);
                    currentProcess.setTurnaroundTime(currentTime - currentProcess.getArrivalTime());
                    currentProcess.setWaitingTime(currentProcess.getTurnaroundTime() - currentProcess.getBurstTime());
                }
            }
        }

        Utils.printProcessTable(processes, "SRTF");
    }
}

