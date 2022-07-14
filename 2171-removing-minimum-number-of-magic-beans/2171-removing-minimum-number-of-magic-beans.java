class Solution {
    public long minimumRemoval(int[] beans) {
        long N = beans.length, ans = Long.MAX_VALUE, sum = 0;
        for (int n : beans) 
            sum += n;
        Arrays.sort(beans);
        for (int i = 0; i < N; ++i) 
            ans = Math.min(ans, sum - (N - i) * beans[i]);
        return ans;
    
    }
}