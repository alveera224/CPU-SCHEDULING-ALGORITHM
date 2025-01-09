import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class RoundRobin {
    public void schedule(List<Process> processes, int timeQuantum) {
        Queue<Process> queue = new LinkedList<>();
        int currentTime = 0;

        for (Process process : processes) {
            if (process.getArrivalTime() <= currentTime) {
                queue.add(process);
            }
        }

        while (!queue.isEmpty()) {
            Process currentProcess = queue.poll();

            if (currentProcess.getRemainingTime() <= timeQuantum) {
                currentTime += currentProcess.getRemainingTime();
                currentProcess.setRemainingTime(0);
                currentProcess.setCompletionTime(currentTime);
                currentProcess.setTurnaroundTime(currentTime - currentProcess.getArrivalTime());
                currentProcess.setWaitingTime(currentProcess.getTurnaroundTime() - currentProcess.getBurstTime());
            } else {
                currentTime += timeQuantum;
                currentProcess.setRemainingTime(currentProcess.getRemainingTime() - timeQuantum);
                queue.add(currentProcess);
            }
        }

        Utils.printProcessTable(processes, "Round Robin");
    }
}

