import java.util.List;

public class Utils {
    public static void printProcessTable(List<Process> processes, String algorithmName) {
        System.out.println("\n" + algorithmName + " Scheduling Results:");
        System.out.println("Process\tAT\tBT\tCT\tTAT\tWT");
        for (Process process : processes) {
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
                    process.getName(),
                    process.getArrivalTime(),
                    process.getBurstTime(),
                    process.getCompletionTime(),
                    process.getTurnaroundTime(),
                    process.getWaitingTime());
        }
    }
}

