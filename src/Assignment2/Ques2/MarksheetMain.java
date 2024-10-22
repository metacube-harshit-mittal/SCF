package Assignment2.Ques2;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Scanner;

public class MarksheetMain {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number of students ");
    int n = sc.nextInt(); 

    if(n <= 0)
    {
        throw new ArithmeticException("Number of students students should be greater than 0");
    }

    //HashMap<String, Integer> marksheet = new HashMap<String,Integer>();
    ArrayList<Integer> marksheet = new ArrayList<Integer>();
    for(int i=0; i<n; i++)
    {
        int student_no = i+1;
        System.out.println("Enter the marks of" +student_no+ " student");
        Integer marks = sc.nextInt();
        if(marks < 0 || marks > 100)
        {

        }
        marksheet.add(marks);
    }

    MarksheetService marksheetService = new MarksheetService();
    System.out.println("Average grade of class is " + String.format("%.2f", marksheetService.avgGrade(marksheet, n)));
    System.out.println("Maximum grade in class is " + marksheetService.maxGrade(marksheet));
    System.out.println("Maximum grade in class is " + marksheetService.minGrade(marksheet));
    System.out.println("Total percentage of passed student is " 
    + String.format("%.2f", marksheetService.passedStudents(marksheet,n)));
}
}
