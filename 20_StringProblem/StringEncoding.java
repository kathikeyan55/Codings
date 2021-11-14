/**
 * eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument
 the string which is to be encoded and returns the encoded string.
 */
String encode(String str)
{
   String ans = "";
   for(int i=0;i<str.length();i++){
       ans+=str.charAt(i);
       int ctn=1;
       while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
           ctn++;
           i++;
       }
       ans +=ctn;
   }
   return ans;
     
}
