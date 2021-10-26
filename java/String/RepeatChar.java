/**
 * You are given a string S (containing only lowercase characters). You need to print the repeated character whose first appearance is leftmost.
Input
The first line of input contains T denoting the number of testcases. T testcases follow.
Each testcase contains one line of input containing the string S.

Constraints:
1 <= T <= 100
1 <= |S| <= 1000

Input:
2
geeksforgeeks
abcd

Output:
g
-1

Explanation:
Testcase1: We see that both e and g repeat as we move from left to right. But the leftmost is g so we print g.
Testcase2: No character repeats so we print -1.
 
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RepeatChar {
	public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
	  int N = scanner.nextInt();
	  while(N>0){
		  String str=scanner.next();
		  int ans=repeatingString(str);
		  if(ans>0)
		  System.out.println(str.charAt(ans));
		  else
		  System.out.println(ans);
		  N--;
	  }
	}
	private static int repeatingString(String word){
		char[] arr = word.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]) return j;
			}
		}
		return -1;
	}
}