class Solution {
   public void merge(int A[], int m, int B[], int n) {
        int insertIndex = m+n-1;
        int indexA = m-1,indexB = n-1;
        
        while(indexB>=0){
            if(indexA<0){
                A[insertIndex--] = B[indexB--];
            }else{
                if(B[indexB]>=A[indexA]){
                    A[insertIndex--] = B[indexB--];
                }else{
                    A[insertIndex--] = A[indexA--];
                }
            }
        }
    }
}