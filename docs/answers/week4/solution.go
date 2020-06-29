package main

import "fmt"

func Solution(n int) int {
	if n == 0 || n == 1 {
		return 1
	}

	dp := make([]int, 2)
	dp[0] = 1
	dp[1] = 2

	for i := 3; i<= n ; i++ {
		next := (dp[1] + dp[0]) % (1e9 + 7)
		dp[0] = dp[1]
		dp[1] = next
	}

	return dp[1]
}

func main() {
	var n int
	fmt.Scanln(&n)
	fmt.Println(Solution(n))
}
