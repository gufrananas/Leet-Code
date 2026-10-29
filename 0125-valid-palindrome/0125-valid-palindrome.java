// class Solution {
//     public boolean isPalindrome(String s) {
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(Character.isLetterOrDigit(ch)){
//                 ans=ans+Character.toLowerCase(ch);
//             }
//         }
//         boolean isPalindrome=true;
//         for(int i=0;i<ans.length()/2;i++){
//             if(ans.charAt(i)!=ans.charAt(ans.length()-1-i)){
//                 isPalindrome=false;
//             }
//         }
//         return isPalindrome;
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}