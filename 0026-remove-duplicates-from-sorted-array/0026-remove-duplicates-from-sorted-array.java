class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> list=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int k=0;
        for(int num:list){
            nums[k++]=num;
        }
    return k;   
    }
}