/*Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not .

Input
The first line of the input contains an integer T, the number of testcases. T lines follow.

Each of the next T lines contains an integer N which has to be tested for primality.

Output
For each test case output in a separate line, "yes" if the number is prime else "no."*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int f=0;
		    if(n==1 || n==0){
		         System.out.println("no");
		    }
		    else{
		        for(int j=2;j<=(n/2);j++)
		        if(n%j==0){
		            f=1;
		        }
		        if(f==0){
		            System.out.println("yes");
		        }
		        else if(f==1){
		            System.out.println("no");
		        }
		    }
		}
		   
	}
}
