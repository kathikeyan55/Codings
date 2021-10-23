import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class StringSum {
	public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
      String word = scanner.next();
           long sum;
        try{
             long num=Long.parseLong(word);
       sum=0;
      while(num>0){
          long last = num%10;
          sum+=last;
          num/=10;
      }
      System.out.print(sum);
        }catch (Exception e){
           int len=word.length();
         sum=0;
       for(int i=0;i<len;i++)
       sum+=word.charAt(i)-48;
        System.out.print(sum);
        }
	}
}