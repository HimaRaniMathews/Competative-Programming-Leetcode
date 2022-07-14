class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        int n=beans.length;
        long total=0;
        long min=Long.MAX_VALUE;
        for(int i:beans){
            total+=i;
        }
        for(int i=0;i<n;i++){
            long p=total-((n-i+0L)*beans[i]);
            min=(long)Math.min(min,p);
            
        }
        return min;
    }
}