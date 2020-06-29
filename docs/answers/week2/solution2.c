#include <stdio.h>

int INF = 0x7f7f7f7f;
int F[10001], A[10001];

int search(int* a, int right, int x)
{
    int left = 1, mid;
    while(left <= right)
    {
        mid = (left + right) >> 1;
        if (a[mid] <= x){
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return left;
}

int main()
{
    int n, maxLen;
    scanf("%d", &n);
    for(int i = 1; i <= n; i++)
    {
        scanf("%d", &A[i]);
        F[i] = INF;
    }
    F[1] = A[1];
    maxLen = 1;
    for(int i = 2; i <= n; i++)
    {
        if(A[i] > F[maxLen])
        {
            F[++maxLen] = A[i];
        } else {
            F[search(F, maxLen, A[i])] = A[i];
        }
    }
    printf("%d\n", maxLen);
    return 0;
}

/*
贪心+二分查找 时间复杂度 O(nlogn)
*/