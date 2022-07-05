class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=((operations[i].charAt(1)=='+')?1:-1);
        }
        return sum;
    }
}