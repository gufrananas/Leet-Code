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
// class Solution {
//     public boolean isPalindrome(String s) {
//         s=s.toLowerCase().replaceAll("[^a-z0-9]","");
//         StringBuilder sb=new StringBuilder(s);
//         sb.reverse();
//         return s.equals(sb.toString());
//     }
// }
class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r&&!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}