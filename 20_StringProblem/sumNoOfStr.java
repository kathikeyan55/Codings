 /**
  * Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Example 1:

Input:
str = 1abc23
Output: 24
Explanation: 1 and 23 are numbers in the
string which is added to get the sum as
24.
Example 2:

Input:
str = geeks4geeks
Output: 4
Explanation: 4 is the only number, so the
sum is 4.
  */
 public static long findSum(String str)
    {
       String temp="0";
       int sum=0;
       for(int i=0;i<str.length();i++){
           
           char ch = str.charAt(i);
           
           if(Character.isDigit(ch)){
               temp+=ch;
           }else{
               sum += Integer.parseInt(temp);
               temp = "0";
           }
           
       }
       return sum+Integer.parseInt(temp);
    }