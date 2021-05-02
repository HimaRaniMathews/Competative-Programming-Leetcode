/*Tomya is a girl. She loves Chef Ciel very much.

Tomya like a positive integer p, and now she wants to get a receipt of Ciel's restaurant whose total price is exactly p. The current menus of Ciel's restaurant are shown the following table.

Name of Menu	price
eel flavored water	1
deep-fried eel bones	2
clear soup made with eel livers	4
grilled eel livers served with grated radish	8
savory egg custard with eel	16
eel fried rice (S)	32
eel fried rice (L)	64
grilled eel wrapped in cooked egg	128
eel curry rice	256
grilled eel over rice	512
deluxe grilled eel over rice	1024
eel full-course	2048
Note that the i-th menu has the price 2i-1 (1 = i = 12).

Since Tomya is a pretty girl, she cannot eat a lot. So please find the minimum number of menus whose total price is exactly p. Note that if she orders the same menu twice, then it is considered as two menus are ordered. (See Explanations for details)

Input
The first line contains an integer T, the number of test cases. Then T test cases follow. Each test case contains an integer p.

Output
For each test case, print the minimum number of menus whose total price is exactly p.

Constrain*/
#include <iostream>
#include<cmath>
using namespace std;

int main() {
    int t,n,c=0,a[13],i,j;
    cin>>t;
    for(i=0;i<12;i++){
        a[i]=pow(2,i);
    }
    while(t--){
        cin>>n;
        c=0;
        j=11;
        while(n)
        {
            c+=n/a[j];
            n%=a[j];
            j--;
        }cout<<c<<endl;
        }
	return 0;
}

