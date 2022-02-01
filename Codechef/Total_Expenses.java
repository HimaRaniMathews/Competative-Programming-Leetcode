/* While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
If the quantity and price per item are input, write a program to calculate the total expenses.

Input
The first line contains an integer T, total number of test cases. Then follow T lines, each line contains integers quantity and price.

Output
For each test case, output the total expenses while purchasing items, in a new line.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int q=sc.nextInt();
		    int p=sc.nextInt();
		    double totalprice=0.0;
		    if(q>1000){
		        totalprice=(q*p)-(q*p*0.1);
		    }
		    else{
		        totalprice=p*q;
		    }
		    System.out.println(totalprice);
		}
	}
}
