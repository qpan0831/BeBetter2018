class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int res=0;
        Set<Character> set = new HashSet<>();
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                res= Math.max(res,j-i);
                    
            }
            else
            {
            set.remove(s.charAt(i++));

            }
            
        }
        return res;
        
    }
}