class Solution {
    public int maxNumberOfBalloons(String text) {
        int count=0;
        while(true){
            int b=0,a=0,l=0,o=0,n=0;
            for(int i=0;i<text.length();i++){
                if(text.charAt(i)=='b'){
                    b++;
                }
                if(text.charAt(i)=='a'){
                    a++;
                }
                if(text.charAt(i)=='l'){
                    l++;
                }
                if(text.charAt(i)=='o'){
                    o++;
                }
                if(text.charAt(i)=='n'){
                    n++;
                }
            }
            if(b>=1&&a>=1&&l>=2&&o>=2&&n>=1){
                count++;
                text=text.replaceFirst("b","");
                text=text.replaceFirst("a","");
                text=text.replaceFirst("l","");
                text=text.replaceFirst("l","");
                text=text.replaceFirst("o","");
                text=text.replaceFirst("o","");
                text=text.replaceFirst("n","");
            }
                else{
                    break;
                }
            }
            return count;
    }
}