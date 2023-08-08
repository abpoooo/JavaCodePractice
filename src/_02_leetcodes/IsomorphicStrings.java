package _02_leetcodes;
//https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        // compare map 1 and 2 with [256] chars

        //base case for different s and t the length should be same for morphic
        if (s.length() != t.length()) return false;

        int [] maps1 = new int[256];
        int [] maps2 = new int[256];
        // Traverse all elements through the loop...

        for (int i = 0; i <s.length() ; i++) {
            // Compare the maps, if not equal, return false...
            if (maps1[s.charAt(i)] != maps2[t.charAt(i)]){
                return false;
            }
            maps1[s.charAt(i)] = i + 1;
            maps2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
