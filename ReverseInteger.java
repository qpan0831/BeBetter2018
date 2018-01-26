class Solution {
    public int reverse(int x) {
        long res = 0;
        boolean isNegative = x>0;
        x=Math.abs(x);
        while(x>0)
        {
            res=res*10+x%10;
            if(res>Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
            x=x/10;
        }
        if(isNegative)
        {
            return (int)res;
        }
        else
            return (int)res*-1;
        
    }
}