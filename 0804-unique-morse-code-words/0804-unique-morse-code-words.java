class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String> set=new HashSet<>();
        for(String word:words){
            String anas="";
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                int index=ch-'a';
                anas=anas+morse[index];
            }
            set.add(anas);
        }
        return set.size();
    }
}