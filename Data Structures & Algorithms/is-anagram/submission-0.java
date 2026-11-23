class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if(n != t.length())return false;
        int[] ar = new int[256];

        for(int i = 0;i<n;i++){
            ar[s.charAt(i)]++;
            ar[t.charAt(i)]--;
        }
        for(int i = 0;i<256;i++){
            if(ar[i] != 0)return false;
        }
        return true;
    }
}
