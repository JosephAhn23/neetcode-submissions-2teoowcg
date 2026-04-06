class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
        return false;
    }

    // Frequency arrays to count characters
    int[] s1Count = new int[26];
    int[] s2Count = new int[26];

    // Count frequencies of characters in s1 and the first s1.length() characters of s2
    for (int i = 0; i < s1.length(); i++) {
        s1Count[s1.charAt(i) - 'a']++;
        s2Count[s2.charAt(i) - 'a']++;
    }

    // Check if the initial window matches
    if (Arrays.equals(s1Count, s2Count)) {
        return true;
    }

    // Sliding window over the rest of s2
    for (int i = s1.length(); i < s2.length(); i++) {
        // Include the next character in the window
        s2Count[s2.charAt(i) - 'a']++;
        // Exclude the character that's no longer in the window
        s2Count[s2.charAt(i - s1.length()) - 'a']--;

        // Check if the current window matches
        if (Arrays.equals(s1Count, s2Count)) {
            return true;
        }
    }

    return false;
}

}
