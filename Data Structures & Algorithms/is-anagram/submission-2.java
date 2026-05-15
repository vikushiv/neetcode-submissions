class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>ss=new HashMap<>();
        Map<Character,Integer>tt=new HashMap<>();

        for(char c: s.toCharArray()){
            ss.put(c, ss.getOrDefault(c, 0)+1);
        }
        for(char ch: t.toCharArray()){
            tt.put(ch, tt.getOrDefault(ch, 0)+1);
        }
        return ss.equals(tt);
    }
}
