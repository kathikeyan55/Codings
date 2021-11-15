/**
 * Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ], 
 * the task is to list all words which are possible by pressing these numbers.
 */
class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    
    {
        String num="";
        for(int x : a){
            num +=x;
        }
        ArrayList<String> res = possibleWordsUtill(num);
        Collections.sort(res);
        return res;
        
    }
    static ArrayList<String> possibleWordsUtill(String str){
        // base case 
        if(str.length() == 0 ){
            ArrayList<String> basres = new ArrayList<>();
            basres.add("");
            return basres;
        }
        char ch = str.charAt(0);
        String resStr =str.substring(1);
        ArrayList<String> preRes  = possibleWordsUtill(resStr);
        ArrayList<String> res = new ArrayList<>();
        String code = getCode(ch - '0');
        for(String val : preRes){
            for(int i=0;i<code.length();i++){
                res.add(code.charAt(i)+ val);
            }
        }
        return res;
    }
    static String getCode(int N){
        String[] code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return code[N];
    }
}