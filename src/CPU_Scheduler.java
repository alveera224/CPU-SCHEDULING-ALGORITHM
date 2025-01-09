import java.util.*;

public class CPU_Scheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of processes
        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        List<Process> processes = new ArrayList<>();

        // Input process details
        for (int i = 0; i < numProcesses; i++) {
            System.out.printf("Enter details for Process %d:\n", i + 1);
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Arrival Time: ");
            int arrivalTime = scanner.nextInt();
            System.out.print("Burst Time: ");
            int burstTime = scanner.nextInt();
            System.out.print("Priority: ");
            int priority = scanner.nextInt();

            processes.add(new Process(name, arrivalTime, burstTime, priority));
        }

        // Select scheduling algorithm
        System.out.println("\nSelect a Scheduling Algorithm:");
        System.out.println("1. First Come First Serve (FCFS)");
        System.out.println("2. Round Robin (RR)");
        System.out.println("3. Shortest Remaining Time First (SRTF)");
        System.out.println("4. Highest Response Ratio Next (HRRN)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                new FCFS().schedule(processes);
                break;
            case 2:
                System.out.print("Enter time quantum: ");
                int timeQuantum = scanner.nextInt();
                new RoundRobin().schedule(processes, timeQuantum);
                break;
            case 3:
                new SRTF().schedule(processes);
                break;
            case 4:
                new HRRN().schedule(processes);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
