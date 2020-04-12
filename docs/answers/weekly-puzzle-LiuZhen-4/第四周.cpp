#include<cstdio>
using namespace std;
int dp[1000000];
int main() {
    int n;
    scanf("%d", &n);
    dp[0] = dp[1] = 1;
    for (int i = 2; i <= n; ++i) {
        for (int j = 1; j <= 2; ++j) {
            if (i >= j) {
                dp[i] = (dp[i] + dp[i - j]) % 1000000007;
            }
        }
    }
    printf("%d", dp[n]);
    return 0;
}