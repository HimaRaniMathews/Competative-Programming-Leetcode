class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
        ans=ans ^ nums[i];
        }
            return ans;
    }
}
//[4,1,2,1,2]
//4 1 2 