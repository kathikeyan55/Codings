
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        String s ="abc";
        System.out.print(Arrays.toString(subString(s)));
    }
    private static String[] subString(String word){
        if(word.length()==0){
            String ans[]={""};
            return ans;
        }

        String[] smallans=subString(word.substring(1));
        String[] ans=new String[2 * smallans.length];

        int idx=0;
        for(int i=0;i<smallans.length;i++){
            ans[idx++]=smallans[i];
        }

        for(int i=0;i<smallans.length;i++){
            ans[idx++]=word.charAt(0)+ smallans[i];
        }
        return  ans;
    }

}
