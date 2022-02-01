/*What is the maximum number of squares of size 2x2 that can be fit in a right angled isosceles triangle of base B.
One side of the square must be parallel to the base of the isosceles triangle.
Base is the shortest side of the triangle
Input
First line contains T, the number of test cases.
Each of the following T lines contains 1 integer B.
Output
Output exactly T lines, each line containing the required answer.*/
#include <stdio.h>

int main(void) {
	// your code goes here
	int t,b;
	scanf("%d",&t);
	while(t--){
	    scanf("%d",&b);
	    int r;
	    r=((b/2)*(b/2-1))/2;
	    printf("%d\n",r);
	}
	return 0;
}

