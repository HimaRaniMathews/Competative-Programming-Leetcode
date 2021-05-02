/*Consider a currency system in which there are notes of six denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
If the sum of Rs. N is input, write a program to computer smallest number of notes that will combine to give Rs. N.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the smallest number of notes that will combine to give N, in a new line.*/

#include <iostream>
using namespace std;

int main() {
    int t,n;
    cin>>t;
    int a[6]={1,2,5,10,50,100};
    while(t--){
        cin>>n;
        int c=0;
        int j=5;
        while(n){
            c+=n/a[j];
            n%=a[j];
            j--;
        }cout<<c<<endl;
    }
	return 0;
}
