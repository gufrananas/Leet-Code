class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];
        k=k%n;
        for(int i=0;i<nums.length;i++){
            int newIndex=(i+k)%n;
            ans[newIndex]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}