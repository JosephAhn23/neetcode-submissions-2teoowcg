class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> ocd = new HashSet<>();
        int l=0;
        int countMax=0;
        for (int i=0; i<s.length(); i++){

            while(ocd.contains(s.charAt(i))){
                ocd.remove(s.charAt(l));
                l++;
            }
            ocd.add(s.charAt(i));
             countMax= Math.max(countMax,ocd.size());

        }
        return countMax;
    }
}
