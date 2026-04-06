class Solution {
    public static int characterReplacement(String s, int k) {
        int size=0, maxCharacterLen = 0, l=0, res=0;
        HashMap <Character, Integer> ocd = new HashMap<>();
        for (int r =0; r<s.length(); r++){
            size++;
            ocd.put(s.charAt(r), ocd.getOrDefault(s.charAt(r), 0) +1);
            maxCharacterLen=Math.max(maxCharacterLen, ocd.get(s.charAt(r)));
             
            if (r - l - maxCharacterLen + 1 > k ){
                char leftChar=s.charAt(l);
                ocd.put(leftChar,ocd.get(leftChar)-1);
                l++;
            }  
            res=Math.max(res, r-l+1);
        }  
        return(res);
    }
}
