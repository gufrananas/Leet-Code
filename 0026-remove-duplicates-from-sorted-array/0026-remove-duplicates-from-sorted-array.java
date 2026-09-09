class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> list=new LinkedHashSet<>();
        for(int num:nums){
            list.add(num);
        }
        int k=0;
        for(int num:list){
            nums[k++]=num;
        }
    return k;   
    }
}