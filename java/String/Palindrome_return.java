/*
Given a string S find minimum number of changes required to make the string palindrome. In a change you can change any index of the string to any character.
A palindrome is a string that remains the same if reversed.
Input
First and only line of input contains a string S.

Constraints
1 <= |S| <= 100000
S contains only lowercase letters
Output
Output a single integer which is the minimum number of changes required to make string palindrome.
###/
sample input 1
abc

sample output 1
1

sample input 2
abcdef

sample output 2
3

*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Palindrome_return {
	public static void main (String[] args) {
		Scanner  scanner = new Scanner(System.in);
		String word=scanner.next();
		System.out.print(palindrome(word));
	}
	private static int palindrome(String word){
		int ctn=0;
		for(int i=0;i<word.length()/2;i++){
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) ctn++;
		}
		return ctn;
	}
}