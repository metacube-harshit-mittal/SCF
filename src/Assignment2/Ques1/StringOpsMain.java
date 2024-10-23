package Assignment2.Ques1;

import java.util.Scanner;

public class StringOpsMain {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter your first String");
       String s1 = sc.nextLine();

       System.out.println("Enter your second String");
       String s2 = sc.nextLine();

       StringOpsService stringOpsService = new StringOpsService();
       
       System.out.println("0 for not equal and 1 for equal: " + stringOpsService.isEqual(s1, s2));
       System.out.println("Reverse of the string is: " + stringOpsService.reverse(s2));
       System.out.println("String after changing the cases: " + stringOpsService.changeString(s1));
       System.out.println("The largest word in the string is: " + stringOpsService.largestWord(s1));
   }
}
