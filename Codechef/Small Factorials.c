//You are asked to calculate factorials of some small positive integers.
#include <iostream>
using namespace std;
#include<boost/multiprecision/cpp_int.hpp>
using namespace boost::multiprecision;
int main() {
	// your code goes here
	int t,n;
		cin>>t;
		while(t--){
		    cin>>n;
		    cpp_int f=1;
		    while(n>0){
		        f*=n;
		        n--;
		    }
		    cout<<f<<"\n";
		}
	return 0;
}
