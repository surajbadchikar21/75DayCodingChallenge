
/* link - https://leetcode.com/problems/container-with-most-water/
 * Brute Force methode (TLE)
 *  public int maxArea(int[] height) {
        int maximum =0,temp=0 ;
        for(int i=0;i<height.length;i++){
            for(int j = 1 ;j<height.length;j++){
                if(height[i]>=height[j]){
                    temp = height[j]*(j-i);
                } 
                else{
                    temp = height[i]*(j-i);
                }
                if(temp>maximum){
                    maximum = temp;
                }
            }
        }
    return maximum;
    }
 */

public class DAY8_ContainerMostWater {
    public int maxArea(int[] height) {
        int max=0,left=0,right=height.length-1,temp=0;
        for(int i=0;i<height.length;i++)
        {   if(height[left]<=height[right]){
            temp=height[left]*Math.abs(right-left);
            left++;
            }
            else{
                 temp=height[right]*Math.abs(right-left);
            right--;
            }
            if(temp>max){max=temp;}
        }
   return max; }
}
