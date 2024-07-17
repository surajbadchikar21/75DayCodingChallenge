// https://leetcode.com/problems/sort-colors/
import java.util.HashMap;

public class Day7_SortColors {
     public void sortColors(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap();
        for(int i =0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int k = 0 ;
        for(int key : map.keySet())
        { int count = map.get(key);
            for(int j =0;j<count;j++)
            {
                nums[k++]=key;
                
            }
        }
    }   
}
