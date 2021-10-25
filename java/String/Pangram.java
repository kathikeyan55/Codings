import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pangram {
	public static void main (String[] args) {
      Scanner  scanner = new Scanner (System.in);
	  int N=scanner.nextInt();
	  for(int i=0;i<N;i++){
		  	 String word = scanner.next();
	   boolean a=pangram(word);
	  int ans =(a)?1:0;
	  System.out.println(ans);
	  }
	 
	}
	private static boolean pangram(String word){
		// if(word.length()<26) return false;
		// word = word.toLowerCase();
		// 	for(char ch='a';ch<='z';ch++){
		// 		if(word.indexOf(ch)<0){
		// 			return false;
		// 		}
		// 	}
		word = word.toLowerCase();
		word =word.replaceAll(" ","");
		int[] arr=new int[26];
		char y[]=word.toCharArray();

		int index=0;	
		for(int i=0;i<y.length;i++){
			index= y[i]-'a';
			arr[index] = 1 ;
			index++;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=1) return false;
		}
		return true;
		
		
		
	}
}