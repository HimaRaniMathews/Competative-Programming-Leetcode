/*Write a program to take two numbers as input and print their difference if the first number is greater than the second number otherwise print their sum.

Input:
First line will contain the first number (N1)
Second line will contain the second number (N2)
Output:
Output a single line containing the difference of 2 numbers (N1−N2) if the first number is greater than the second number otherwise output their sum (N1+N2).*/
#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n1,n2;
	cin>>n1>>n2;
	if(n1>n2){
	    cout<<(n1-n2)<<endl;
	}
	else{
	    cout<<(n1+n2)<<endl;
	}
	return 0;
}
