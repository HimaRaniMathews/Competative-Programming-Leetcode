class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int m=x;
        int s=0;
        while(x!=0){
            s=s*10+(x%10);
            x=x/10;
        }
        return s==m;
    }
}