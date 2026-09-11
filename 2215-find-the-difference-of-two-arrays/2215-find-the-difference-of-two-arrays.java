class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            set1.add(num);
        }
        HashSet<Integer> result1=new HashSet<>(set);
        HashSet<Integer> result2=new HashSet<>(set1);
        result1.removeAll(set1);
        result2.removeAll(set);
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>(result1));
        ans.add(new ArrayList<>(result2));
        return ans;
    }
}