package lpPrac;

public class SJF {
    public static void main(String[] args) {
        int n = 5;  // Number of processes
        int completedProcesses = 0;  // Count of completed processes
        int systemTime = 0;  // Current system time
        float totalWaitingTime = 0;
        float totalTurnaroundTime = 0;
        
        int[] pid = {1, 2, 3, 4, 5}; // Process IDs
        int[] at = {0, 0, 6, 11, 12}; // Arrival times
        int[] bt = {4, 3, 7, 4, 2};   // Burst times
        int[] completionTime = new int[n]; // Completion times
        int[] turnaroundTime = new int[n]; // Turnaround times
        int[] waitingTime = new int[n];    // Waiting times
        int[] finished = new int[n]; // Flags for completed processes
        
        // Initialize finished array to 0 (indicating no process is completed)
        for(int i = 0; i < n; i++) {
            finished[i] = 0;
        }

        // Main loop for scheduling
        while (true) {
            int minBurstIndex = n;  // Initialize as n to check if any process is selected
            int minBurstTime = Integer.MAX_VALUE;

            // Break the loop if all processes are completed
            if (completedProcesses == n) break;

            // Find the process with minimum burst time among arrived processes
            for (int i = 0; i < n; i++) {
                if ((at[i] <= systemTime) && (finished[i] == 0) && (bt[i] < minBurstTime)) {
                    minBurstTime = bt[i];
                    minBurstIndex = i;
                }
            }

            // If no process was found, increment the system time
            if (minBurstIndex == n) {
                systemTime++;
            } else {
                // Process the selected job
                completionTime[minBurstIndex] = systemTime + bt[minBurstIndex];
                systemTime += bt[minBurstIndex];  // Update system time after process execution
                turnaroundTime[minBurstIndex] = completionTime[minBurstIndex] - at[minBurstIndex];
                waitingTime[minBurstIndex] = turnaroundTime[minBurstIndex] - bt[minBurstIndex];
                finished[minBurstIndex] = 1;  // Mark as completed
                completedProcesses++;  // Increment completed process count
            }
        }

        // Calculate total waiting time and total turnaround time
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnaroundTime += turnaroundTime[i];
        }
        
        // Calculate averages
        float avgWaitingTime = totalWaitingTime / n;
        float avgTurnaroundTime = totalTurnaroundTime / n;

        // Print results
        System.out.println("\nProcess\tArrival Time\tBurst Time\tWaiting Time");
        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t\t" + at[i] + "\t\t" + bt[i] + "\t\t" + waitingTime[i]);
        }
        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

}
