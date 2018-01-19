import java.util.HashMap;
import java.util.Map;
class twoSum{

    public static void main(String[] args){
        int[] nums ={2,5,7};
        int target=7;
        int[] result=twoSum.twoSum(nums, target);
        for(int a:result)
        {
            System.out.print(a+" ");
        }

    }
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
            
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(map.containsKey(diff))
            {
                if(map.get(diff)!=i){
                int result[]={i,map.get(diff)};
                return result;
                }
           
            }
        }
        
        return null;
    }
}