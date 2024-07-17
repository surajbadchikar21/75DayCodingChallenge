// https://leetcode.com/problems/sort-colors/
import java.util.HashMap;

public class Day7_SortColors {
    //  public void sortColors(int[] nums) {
    //     HashMap <Integer,Integer> map = new HashMap();
    //     for(int i =0;i<nums.length;i++)
    //     {
    //         if(map.containsKey(nums[i]))
    //         {
    //             map.put(nums[i],map.get(nums[i])+1);
    //         }
    //         else{
    //             map.put(nums[i],1);
    //         }
    //     }
    //     int k = 0 ;
    //     for(int key : map.keySet())
    //     { int count = map.get(key);
    //         for(int j =0;j<count;j++)
    //         {
    //             nums[k++]=key;
                
    //         }
    //     }
    // }   

    // better T.C

    class Solution {
        public void sortColors(int[] nums) {
            int cnt0 = 0, cnt1 = 0, cnt2 = 0;
    
            // Count the occurrences of 0, 1, and 2
            for (int num : nums) {
                if (num == 0) {
                    cnt0++;
                } else if (num == 1) {
                    cnt1++;
                } else if (num == 2) {
                    cnt2++;
                }
            }
    
            // Overwrite the array with the correct number of 0s, 1s, and 2s
            int index = 0;
            for (int i = 0; i < cnt0; i++) {
                nums[index++] = 0;
            }
            for (int i = 0; i < cnt1; i++) {
                nums[index++] = 1;
            }
            for (int i = 0; i < cnt2; i++) {
                nums[index++] = 2;
            }
        }
}
