class Solution {
    public long countCommas(long n) {
        long base=1000;
        long countCommas=0;
        while(base<=n){
            countCommas+=n-base+1;
            base=base*1000;
        }
        return countCommas;
    }
}