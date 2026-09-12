class Solution {
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int cur=0;
            char ch=s.charAt(i);
            if(s.charAt(i)=='I'){
                cur=1;
            }
            else if(s.charAt(i)=='V'){
                cur=5;
            }
            else if(s.charAt(i)=='X'){
                cur=10;
            }
            else if(s.charAt(i)=='L'){
                cur=50;
            }
            else if(s.charAt(i)=='C'){
                cur=100;
            }
            else if(s.charAt(i)=='D'){
                cur=500;
            }
            else if(s.charAt(i)=='M'){
                cur=1000;
            }
            if(i+1<s.length()){
                int next=0;
                if(s.charAt(i+1)=='I'){
                    next=1;                    
                }
                else if(s.charAt(i+1)=='V'){
                    next=5;
                }
                else if(s.charAt(i+1)=='X'){
                    next=10;
                }
                else if(s.charAt(i+1)=='L'){
                    next=50;
                }
                else if(s.charAt(i+1)=='C'){
                    next=100;
                }
                else if(s.charAt(i+1)=='D'){
                    next=500;
                }
                else if(s.charAt(i+1)=='M'){
                    next=1000;
                }
                if(cur<next){
                    res=res-cur;
                }
                else{
                    res=res+cur;
                }
            }
            else{
                res=res+cur;
            }
        }
        return res;
    }
}