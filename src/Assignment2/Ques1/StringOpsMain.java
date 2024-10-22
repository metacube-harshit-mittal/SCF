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
       
       System.out.println(stringOpsService.isEqual(s1, s2));
       System.out.println(stringOpsService.reverse(s2));
       System.out.println(stringOpsService.changeString(s1));
       System.out.println(stringOpsService.largestWord(s1));
   }
}
