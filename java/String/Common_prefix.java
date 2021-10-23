
/**
 * 
Given an array of N strings, find the longest common prefix among all strings present in the array.
Problem asked in Amazon, Flipkart.
Sample Input:
4
geeksforgeeks geeks geek geezer

Sample Output:
gee

Sampel Input:-
3
a b c

Sample Output:-
-1
 */
import java.util.Scanner;

public class Common_prefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        String arr[]=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=scanner.next();
        scanner.close();
        String ans= prefix(arr);
        if(ans.length()>0){
            System.out.print(ans);
        }else{
            System.out.print(-1);
        }
    }
    private  static  String  prefix(String words[]){
//        String ans="";
        String pre=words[0];
        for(int i=1;i<=words.length-1;i++){
            pre=fintPrefix(pre,words[i]);
        }
        return pre;
    }
    private static String fintPrefix(String st1,String str2){
        String result="";
        int n1=st1.length();
        int n2=str2.length();
        int idx=0;
        for( int i=0,j=0 ; i<n1  && j<n2 ;i++, j++){
            if(st1.charAt(i)!= str2.charAt(j)) break;
            if(st1.charAt(i)== str2.charAt(j)) idx++;
        }
        result =st1.substring(0,idx);
        return result;
    }

}
