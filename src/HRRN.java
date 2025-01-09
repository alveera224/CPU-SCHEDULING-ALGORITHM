import java.util.List;

public class HRRN {
    public void schedule(List<Process> processes) {
        int currentTime = 0;
        int completed = 0;
        int n = processes.size();

        while (completed < n) {
            Process selectedProcess = null;
            double maxResponseRatio = -1;

            // Find the process with the highest response ratio
            for (Process process : processes) {
                if (process.getArrivalTime() <= currentTime && process.getRemainingTime() > 0) {
                    double responseRatio = (currentTime - process.getArrivalTime() + process.getBurstTime()) / (double) process.getBurstTime();
                    if (responseRatio > maxResponseRatio) {
                        maxResponseRatio = responseRatio;
                        selectedProcess = process;
                    }
                }
            }

            if (selectedProcess == null) {
                currentTime++;
            } else {
                currentTime += selectedProcess.getBurstTime();
                selectedProcess.setRemainingTime(0);
                selectedProcess.setCompletionTime(currentTime);
                selectedProcess.setTurnaroundTime(currentTime - selectedProcess.getArrivalTime());
                selectedProcess.setWaitingTime(selectedProcess.getTurnaroundTime() - selectedProcess.getBurstTime());
                completed++;
            }
        }

        Utils.printProcessTable(processes, "HRRN");
    }
}
