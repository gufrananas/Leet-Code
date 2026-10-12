class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> set=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.put(ch,set.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(set.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}