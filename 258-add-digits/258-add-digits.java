class Solution {
    public int addDigits(int num) {
        Set<Integer> s=new HashSet<>();
        
        while(s.add(num)){
            int ss=0;
            while(num!=0){
                int r=num%10;
                ss+=r;
                num=num/10;
            }
            if(ss>=0 && ss<=9){
                return ss;
            }
            else{
                num=ss;
            }
        }
        return 0;
    }
}