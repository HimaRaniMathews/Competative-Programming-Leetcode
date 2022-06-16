class Solution {

    int left = 0, right = 0;
        
    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++){
            expand(i, i, s);
            expand(i, i+ 1, s);
        }
        return s.substring(this.left, this.right + 1);
    }
    
    void expand(int left, int right, String s){ 
        while((left >= 0 && right <= s.length() - 1) && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        left++;
        right--;
        
        if(right - left + 1 > this.right - this.left + 1){
            this.left = left;
            this.right = right;
        }
    }
}