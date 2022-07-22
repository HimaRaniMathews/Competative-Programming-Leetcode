class Solution {
    public boolean isHappy(int n) {
     Set<Integer> s=new HashSet<>();
    while(s.add(n)){
        int ss=0;
        while(n!=0){
            int t=n%10;
            ss+=t*t;
            n=n/10;
        }
        if(ss==1){
            return true;
        }
        else{
            n=ss;
        }
    }
        return false;
    }
}