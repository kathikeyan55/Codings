import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OddCharacters {
	public static void main (String[] args) {
        Scanner  scanner = new Scanner(System.in);
		String word=scanner.next();
		String newWord="";
		for(int i=0;i<word.length();i++){
			if(i%2!=0){
				newWord+=" ";
			}else{
				newWord+=word.charAt(i);
			}
		}
		System.out.print(newWord);
	}
}