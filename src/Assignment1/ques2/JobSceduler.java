package Assignment1.ques2;
public class JobSceduler {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       int [][] arr = {{0,10}
                       ,{6,20}
                       ,{60,10}
                       ,{110,5}};
         JobSchedulerService jobSchedulerService = new JobSchedulerService();
         System.out.println("Completion time of the processes are " + jobSchedulerService.completionTime(arr));
         System.out.println("Waiting time of the processes are " + jobSchedulerService.waitingTime(arr));
         System.out.println("Turnaround time of the processes are " + jobSchedulerService.turnAroundTime(arr));
         System.out.println("Avg waiting time of the processes are " + jobSchedulerService.avgWaitingTime());
         System.out.println("Maximum waiting time of the processes are " + jobSchedulerService.maximumWaitingTime()); 
    }
}
