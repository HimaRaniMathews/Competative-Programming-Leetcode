class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0, ans = 0, diff = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            int newDiff = A[i] - A[i-1];
            if (newDiff == diff) ans += count++;
            else {
                diff = newDiff;
                count = 1;
            }
        }
        return ans;
    }
}