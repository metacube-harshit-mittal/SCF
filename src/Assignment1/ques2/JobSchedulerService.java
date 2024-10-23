package Assignment1.ques2
;
import java.util.ArrayList;

public class JobSchedulerService {
    ArrayList<Integer> ct = new ArrayList<Integer>();
    ArrayList<Integer> wt = new ArrayList<>();
    ArrayList<Integer> tat = new ArrayList<>();
       public ArrayList<Integer> completionTime(int [][] process)
        {
           ct.add(process[0][1]);
           int currentCt = process[0][1];
           for(int i=1; i<process.length; i++)
           {
               if(currentCt > process[i][0])
               currentCt += process[i][1];
               else
               currentCt = process[i][0] + process[i][1];

               ct.add(currentCt);
           }
           return ct;
        }

        public ArrayList<Integer> waitingTime(int [][] process)
        {
            wt.add(0);
            for(int i=1; i<ct.size(); i++)
            {
                if(process[i][0] < ct.get(i-1))
                {
                    wt.add(ct.get(i-1) - process[i][0]);
                }
                else
                {
                    wt.add(0);
                }
            }
            return wt;
        }

        public ArrayList<Integer> turnAroundTime(int [][] process)
        {
              for(int i=0; i<ct.size(); i++)
              {
                tat.add(process[i][1] + wt.get(i));
              }
              return tat;
        }

        public int avgWaitingTime()
        {
            int ans = 0;
            for(int i=0; i<wt.size(); i++)
            {
                ans += wt.get(i);
            }
            ans = ans/wt.size();

            return ans;
        }

        public int maximumWaitingTime()
        {
            int result = wt.get(0);
            for(int i=1; i<wt.size(); i++)
            {
                result = Math.max(result, wt.get(i));
            }
            return result;
        }
}
