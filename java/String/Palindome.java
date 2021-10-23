import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Palindome {
	public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
		 String word=scanner.next();
		 System.out.print(palidrome(word));
		 
	}
	private static int palidrome(String word){
		for(int i=0;i<word.length()/2;i++){
			if(word.charAt(i)!=word.charAt(word.length()-i-1)) return 0;
		}
		return 1;
	}
}