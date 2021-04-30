/*Three numbers A, B and C are the inputs. Write a program to find second largest among them.

Input
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

Output
For each test case, display the second largest among A, B and C, in a new line.*/
//CODE
#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
    int t,a[3];
    cin>>t;
    while(t--){
        for(int i=0;i<3;i++){
            cin>>a[i];
        }
        sort(a,a+3);
        cout<<a[1]<<"\n";
    }
	return 0;
}

