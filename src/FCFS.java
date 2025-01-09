import java.util.List;

public class FCFS {
    public void schedule(List<Process> processes) {
        int currentTime = 0;

        for (Process process : processes) {
            if (currentTime < process.getArrivalTime()) {
                currentTime = process.getArrivalTime();
            }
            currentTime += process.getBurstTime();

            process.setCompletionTime(currentTime);
            process.setTurnaroundTime(currentTime - process.getArrivalTime());
            process.setWaitingTime(process.getTurnaroundTime() - process.getBurstTime());
        }

        Utils.printProcessTable(processes, "FCFS");
    }
}
