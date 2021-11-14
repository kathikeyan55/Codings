/**
 * 
Given a String S, reverse the string without reversing its individual words.
 Words are separated by dots.
 */
String reverseWords(String S)
{
    String[] word = S.split("\\.");
    String ans="";
    for(int i=word.length-1;i>=0;i--){
        ans +=word[i];
        if(i!=0) ans +='.';
    }
    return ans;
}