#include <stdio.h>

int array[10001];
int maxLenArray[10001];

int main()
{
    int n = 0, i, j, maxLen = 1;
    scanf("%d", &n);
    for(i = 1; i <= n; i++)
    {
        scanf("%d", &array[i]);
        maxLenArray[i] = 1;
    }
    for(i = 2; i <= n; i++)
    {
        for(j = 1; j < i; j++)
        {
            if(array[i] > array[j])
            {
                maxLenArray[i] = maxLenArray[i] > maxLenArray[j] + 1 ? maxLenArray[i] : maxLenArray[j] + 1;
            }
        }
        maxLen = maxLen > maxLenArray[i] ? maxLen : maxLenArray[i];
    }
    printf("%d", maxLen);
    return 0;
}

/*
动态规划 时间复杂度 O(n²)
a_k表示序列中的一个元素，maxLenArray(k) 表示以 a_k 为终点的最长上升子序列的长度
初始状态：maxLenArray(0) = 1
maxLenArray(k) = max{maxLenArray(i) | 0 <= i < k 且 a_i < a_k 且 k ≠ 0} + 1
如果找不到符合条件的 maxLenArray(i)，则 maxLenArray(k) = 1
maxLenArray(k) 的值就是在 a_k 左边终点数值小于 a_k，最长的那个上升子序列的长度加上1
*/

