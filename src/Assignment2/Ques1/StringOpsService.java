package Assignment2.Ques1;

public class StringOpsService {
    /**
     * Checks if two string are equal or not
     * @param s1 is 1st string which is going to be compared
     * @param s2 is 2nt string which is going to be compared
     * @return 0 or 1 on basis if s1 and s2 are equal or not if equal then 1 else 0
     */
      public int isEqual(String s1, String s2){
         
        int len1 = s1.length();
        int len2 = s2.length();
        
        //if length of both strings is not equal, they can't be equal
        if(len1 != len2)
        {
            return 0;
        }

        //if length is same then comparing the strings at each index. 

        boolean flag = true; //keep track if the characters are same or not

        for(int i=0; i<len1; i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            return 1;
        }
        return 0;
      }
 
      /**
       * reverses the string
       * @param s is the which has to be revesed
       * @return the revered string
       */
      public String reverse(String s)
      {
         String ans = "";

         for(int i=0; i<s.length(); i++)
         {
            ans = s.charAt(i) + ans;
         }
         return ans;
      } 

      
      /**
       * This method changes lower case to upper ans vice versa.
       * @param s is the string which has to be changed
       * @return the the changed string
       */
      public String changeString(String s){
         String ans = "";
         for(int i=0; i<s.length(); i++)
         {
            //Convers uppercase to lower
             if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
             {
                ans += (char)(s.charAt(i) - 'A' + 'a');
             }
             //converts lowercase to uppercase
             else
             {
                ans += (char)(s.charAt(i) - 'a' + 'A');
             }
         }
         return ans;
      }

      /**
       * finding the largest word of a string
       * @param s is the string from which the largest word has to be found
       * @return largest word from the string
       */
      public String largestWord(String s)
      {
        int current_count = 0;
        int max_count = 0;
        
        String current_ans = "";
        String ans = "";

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' '){
                current_count = 0;
                current_ans = "";
            }
            else{
                current_count++;
                current_ans = current_ans + s.charAt(i);
                if(current_count >= max_count)
                {
                    max_count = current_count;
                    ans = current_ans;
                }
            }
        }
        return ans;
      }
}
