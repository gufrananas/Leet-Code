class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        for(int i=1; ;i++){
            boolean flag=false;
            int m=i*k;
            for(int j=0;j<n;j++){
                if(nums[j]==m){
                    flag=true;
                    break;
                    }
                }
                if(!flag){
                return m;
            }
        }
    }
}