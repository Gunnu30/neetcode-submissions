class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int[]ar = new int[26];
            for(int i = 0;i<s.length();i++){
                ar[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<26;i++){
                sb.append('#').append(ar[i]);
            }

            map.computeIfAbsent(sb.toString() , k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());

    }
}