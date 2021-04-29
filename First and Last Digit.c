QUE: https://www.codechef.com/problems/FLOW004
#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t,n,f;
	cin>>t;
	while(t--){
	    cin>>n;
	    int l=n%10;
	    while(n!=0){
	        f=n;
	        n=n/10;
	    }
	    cout<<(f+l)<<"\n";
	}
	return 0;
}
