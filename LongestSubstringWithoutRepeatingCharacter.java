import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,len=s.length(),res=0;
        Set<Character> set = new HashSet<>();
        while(left<len&&right<len)
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right++));
                res=Math.max(res,right-left);
            }
            else
            {
                set.remove(s.charAt(left++));
            }
        }
        return res;
    }
}