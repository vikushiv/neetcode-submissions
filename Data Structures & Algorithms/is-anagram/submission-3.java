class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>ss=new HashMap<>();
        Map<Character,Integer>tt=new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length();i++){
            ss.put(s.charAt(i), ss.getOrDefault(s.charAt(i), 0)+1);
            tt.put(t.charAt(i), tt.getOrDefault(t.charAt(i), 0)+1);
        }

        // for(char c: s.toCharArray()){
        //     ss.put(c, ss.getOrDefault(c, 0)+1);
        // }
        // for(char ch: t.toCharArray()){
        //     tt.put(ch, tt.getOrDefault(ch, 0)+1);
        // }
        return ss.equals(tt);
    }
}
