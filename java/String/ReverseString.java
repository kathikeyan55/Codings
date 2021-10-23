import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ReverseString{
	public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);
		 
	 String word=scanner.next();
	 try{
		 long l = Long.parseLong(word);
		 
		 long sum=0;
		 if(l<0) {
			 fun( word,sum);
			 return;
		 }
		 while(l>0){
			
			 sum =(sum*10)+(l%10);
			 l/=10;
			 
		 }
		 System.out.print(sum);

	 }catch(Exception e){
		 long sum=0;
		 fun(word,sum);
		
	 }
	 
	}
	private static void fun(String word,long sum){
		 String ans="";
	 for(int i=word.length()-1;i>=0;i--){
		 
		 ans+=word.charAt(i);
	 }
	 System.out.print(ans);
	}
	
}