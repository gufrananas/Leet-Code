// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> res = new ArrayList<>();
//         boolean[] visited = new boolean[strs.length];
//         for (int i = 0; i < strs.length; i++) {
//             if (visited[i]) {
//                 continue;
//             }
//             List<String> group = new ArrayList<>();
//             char[] first = strs[i].toCharArray();
//             Arrays.sort(first);
//             group.add(strs[i]);
//             visited[i] = true;
//             for (int j = i + 1; j < strs.length; j++) {
//                 if (visited[j]) {
//                     continue;
//                 }
//                 char[] second = strs[j].toCharArray();
//                 Arrays.sort(second);
//                 if (Arrays.equals(first, second)) {
//                     group.add(strs[j]);
//                     visited[j] = true;
//                 }
//             }
//             res.add(group);
//         }
//         return res;
//     }
// }

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> set=new HashMap<>();
       for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!set.containsKey(key)){
                set.put(key,new ArrayList<>());
            }
            set.get(key).add(strs[i]);    
       } 
       return new ArrayList<>(set.values());
    }
}