/*The citizens of Byteland regularly play a game. They have blocks each denoting some integer from 0 to 9. These are arranged together in a random manner without seeing to form different numbers keeping in mind that the first block is never a 0. Once they form a number they read in the reverse order to check if the number and its reverse is the same. If both are same then the player wins. We call such numbers palindrome.

Ash happens to see this game and wants to simulate the same in the computer. As the first step he wants to take an input from the user and check if the number is a palindrome and declare if the user wins or not. 

Input
The first line of the input contains T, the number of test cases. This is followed by T lines containing an integer N.

Output
For each input output "wins" if the number is a palindrome and "loses" if not, in a new line.*/

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t,n,p=0,r;
	cin>>t;
	while(t--){
	    cin>>n;
	    int m=n;
	    p=0;
	    while(n!=0){
	        r=n%10;
	        p=p*10+r;
	        n=n/10;
	    }
	    if(p==m){
	        cout<<"wins\n";
	    }
	    else{
	        cout<<"loses\n";
	    }
	}
	return 0;
}
