class Solution {
    public static int characterReplacement(String s, int k) {
        int l=0, size=0, maxCharLen=0, res=0;
        HashMap<Character, Integer> ocd = new HashMap<>();

        for (int r=0; r<s.length();r++){
            ocd.put(s.charAt(r), ocd.getOrDefault(s.charAt(r),0)+1);
       
            maxCharLen=Math.max(maxCharLen, ocd.get(s.charAt(r)));
            if (r-l+1  -maxCharLen > k){
                //gotta continue traversing through arr, so remove left char
                char leftChar=s.charAt(l);
                ocd.put(leftChar,ocd.get(leftChar)-1);
                l++;
            }
            res=Math.max(res, r-l+1);
        }
        return res;
    }
}
