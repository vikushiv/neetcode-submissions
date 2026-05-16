// Input: strs = ["act","pots","tops","cat","stop","hat"]

// Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String key=new String(arr);
        map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
