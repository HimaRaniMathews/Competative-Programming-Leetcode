//Given the list of numbers, you are to sort them in non decreasing order.
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	int n[t], k;
	    for(k=0;k<t;k++){
	        cin>>n[k];
	    }
sort(n,n+t);
	    for(k=0;k<t;k++){
	        cout<<n[k]<<"\n";
	    }
	return 0;
}
