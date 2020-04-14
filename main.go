package main

import (
	"fmt"
	"math"
)

func main(){
	var(
		a [100]int
		dp [100]float64 //dp[i]为以a[i]结尾的最长上升序列的长度
		n int
	)
	fmt.Scan(&n)
	for i:=0;i<n;i++{
		fmt.Scan(&a[i])
	}
	var ans float64=-1  //记录最大的dp[i]
	for i:=0;i<n;i++{
		dp[i]=1  //初始化为1
		for j:=0;j<i;j++{
			if (a[i]>a[j])&&(dp[j]+1>dp[i]){
				dp[i]=dp[j]+1 //状态转移方程
			}
		}
		ans=math.Max(ans,dp[i]) //更新为最大的
	}
	fmt.Println(ans)
}
