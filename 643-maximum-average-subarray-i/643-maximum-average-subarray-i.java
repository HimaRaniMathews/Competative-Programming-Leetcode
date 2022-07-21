class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
        if(nums.length==1){
            return (double)nums[0];
        }
        double s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        double max=s;
        double ns=s;
        for(int i=k;i<nums.length;i++){
            ns+=nums[i]-nums[i-k];
             max=Math.max(max,ns);
        }
        return (max*1.0)/k;
    }
}