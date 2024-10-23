package Assignment2.Ques2;

import java.util.ArrayList;

public class MarksheetService {

    /**
     * Method to find out the average grade of all students
     * @param marksheet has the markes of students
     * @param noOfStudents no of students in the marksheet
     * @return the averge grade of students
     */
    public float avgGrade(ArrayList<Integer> marksheet, int noOfStudents){
        float totalMarks = 0.00f;
        for(int i=0; i<noOfStudents; i++)
        {
            totalMarks += marksheet.get(i);
        }
        float avgGrade = 0.00f;
        avgGrade = totalMarks/noOfStudents;
                   
        return avgGrade;
    }

    /**
     * Method to find out the maximum grade out of all students
     * @param marksheet has the markes of students
     * @return the maximum grade from all students
     */
    public Integer maxGrade(ArrayList<Integer> marksheet)
    {
            if(marksheet.size() == 0)
            {
                return null;
            }
            Integer ans = marksheet.get(0);
            for(int i=1; i<marksheet.size(); i++)
            {
                ans = Math.max(ans, marksheet.get(i));
            }
       
        return ans;
    }
    
    /**
     * Method to find out the minimum grade out of all students
     * @param marksheet has the markes of students
     * @return the minimum grade from all students
     */
    public Integer minGrade(ArrayList<Integer> marksheet)
    {
        if(marksheet.size() == 0)
        {
            return null;
        }
        Integer ans = marksheet.get(0);
        for(int i=1; i<marksheet.size(); i++)
        {
            ans = Math.min(ans, marksheet.get(i));
        }
        return ans;
    }
   
    /**
     * Method to find out the percentage of passed
     * @param marksheet has the markes of students
     * @param noOfStudents no of students in the marksheet
     * @return the percentage of passed students
     */
    public float passedStudents(ArrayList<Integer> marksheet,int noOfStudents){
        int count = 0;
        for(int i=0; i<noOfStudents; i++)
        {
            if(marksheet.get(i) >= 40){
                count++;
            }
        }
        float ans = 0.00f;
        try{
         ans = ((float)(count)/(float)(noOfStudents))*100.00f;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        return ans;
    }
}
