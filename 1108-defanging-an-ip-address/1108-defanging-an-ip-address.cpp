class Solution {

public:

    string defangIPaddr(string address) {

       

        string s,a,c;

   s=address;

   a="[.]";

    for(int i=0; i<s.length(); i++){

    if(s[i]=='.'){

        c=c+a;

    }

    else{

        c=c+s[i];

    }

    }

    return c;  

    }

};