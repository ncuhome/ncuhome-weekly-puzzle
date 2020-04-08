#include<iostream>
#include<string>

using namespace std;

void test(string str){
    long ans=0;
    string newStr;
    newStr+=str[0];
    for(int l=0, r=0; l<str.length()&&r<str.length(); ){
            if(newStr.find(str[r])==string::npos){
                newStr+=str[r];
                ++r;
            }
            else{
                newStr.erase(newStr.begin());
                ++l;
            }
            if(ans<(r-l+1))
                ans=r-l+1;
        }
    cout<<ans;
}

int main(void){
    string str;
    getline(cin,str);
    test(str);
    return 0;
}
