package Assignment1;

public class Service {
     public int hexaToDeci(String num)
     {
        int len = num.length();
        int ans = 0;
        int base = 1;
        for(int i = len-1; i>=0; i--)
        {
             if(num.charAt(i) >= 'A' && num.charAt(i) <='F')
             {
                ans += (num.charAt(i) - 'A' + 10)*base;
             }
             else
             {
                ans += (num.charAt(i) - '0')*base;
             }
             base *= 16;
        }
        return ans;
     }
     
     public String decToHexa(int num)
     {
        String temp_ans = "";
        while(num != 0)
        {
            int temp = num%16;
            if(temp > 9)
            {
                temp_ans += (char)(temp + 'A' - 10);
            }
            else
            {
                temp_ans += (char)(temp + '0');
            }
            num = num/16;
        }
          String ans = "";
          for(int i = temp_ans.length()-1; i>=0; i--)
          {
            ans += temp_ans.charAt(i);
          }
     return ans;
     }

      public String add(String x, String y)
      {
             int num1 = hexaToDeci(x);
             int num2 = hexaToDeci(y);

             int ans = num1 + num2;

             return decToHexa(ans);
      }
      public String subtract(String x, String y)
      {
             int num1 = hexaToDeci(x);
             int num2 = hexaToDeci(y);

             int ans = num1 - num2;
             if(ans == 0)
             {
                return "0";
             }
             if(num1 < num2)
             {
                return "The answer would be negative";
             }
                return decToHexa(ans);
       }
      public String multiply(String x, String y)
      {
        int num1 = hexaToDeci(x);
        int num2 = hexaToDeci(y);

        int ans = num1 * num2;
           return decToHexa(ans);
      }
        public String divide(String x, String y)
      {
        int num1 = hexaToDeci(x);
        int num2 = hexaToDeci(y);

        int ans = num1 / num2;
        if(ans == 0)
        {
            return("0");
        }
           return decToHexa(ans);
      }

      public boolean comparator(String x, String y, String compariosion)
      {
          int len1 = x.length();
          int len2 = y.length();
          boolean flag = true;
          if((compariosion == ">") && (len1 > len2))
          return true;
          else if(compariosion == ">" && ((len1 < len2) || x.equals(y)))
          return false;
          else if(compariosion == "<" && (len1 < len2))
          return true;
          else if(compariosion == "<" && ((len1 > len2) || x.equals(y)))
          return false;
          else if(compariosion == "==" && x.equals(y))
          return true;
          else if(compariosion == "==" &&((len1 > len2) || (len1 < len2)))
          return false;
          else{
            for(int i=0; i<len1; i++)
            {
                if((compariosion == ">") && (x.charAt(i) > y.charAt(i)))
                   flag = true;
                else if((compariosion == ">") && (x.charAt(i) < y.charAt(i))){
                   flag = false;
                   break;
                }
                else if((compariosion == "<") && (x.charAt(i) < y.charAt(i)))
                flag = true;
                else if((compariosion == "<") && (x.charAt(i) > y.charAt(i))){
                    flag = false;
                    break;
                }
                else if((compariosion == "==") && ((x.charAt(i) < y.charAt(i))|| (x.charAt(i) > y.charAt(i)))){
                    flag = false;
                    break;
                }
                
            }
      }
      return flag;
}
}
