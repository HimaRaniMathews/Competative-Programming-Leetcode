/*Two integers A and B are the inputs. Write a program to find GCD and LCM of A and B.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer A and B.

Output
Display the GCD and LCM of A and B separated by space respectively. The answer for each test case must be displayed in a new line.*/
#include <iostream>
using namespace std;

long long int gcd(int a,int b){
    long long int gcd;
      for(int i=1; i <= a && i <= b; ++i)
    {
        if(a%i==0 && b%i==0)
            gcd = i;
    }
    return gcd;

}
int main() 
{
	long long int t,a,b;
	cin>>t;
	while(t--)
	{
	    cin>>a>>b;
	    if(a<=1000000 && b<=1000000){
	    long long int g=1;
	        g=gcd(b,a);
	    cout<<g<<" "<<(a*b)/g<<endl;
	    }
	}
	return 0;
}
