#include <iostream>
#include <vector>
#include <ctime>
#include <cstdlib>
#include <algorithm>

using namespace std;

void findDiffNum() ;

int main() {
    try {
        findDiffNum();
    }
    catch (exception e) {throw e;}
    return 0;
}

void findDiffNum() {
    srand((unsigned int)time(NULL));
    vector<long long> arr;
    vector<long long> ans;
    long long temp;
    while(cin>>temp){
        arr.push_back(temp);
    }
    auto l=arr.begin(), r=arr.end();
    sort(l,r);
    temp=*l;
    for(++l;l!=r;++l){
        if(*l==temp)
            ans.push_back(temp);
        temp=*l;
    }
    cout<<ans[rand()%ans.size()];
}