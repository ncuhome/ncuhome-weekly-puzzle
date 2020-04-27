package main

import (
	"fmt"
)

func stringLen(s string) int {
	var answer, resultlen int
	str := []byte(s)
	dp := make(map[byte]int)
	for i := 0; i < len(str); i++ {
		if v, ok := dp[str[i]]; ok { //找到上一次出现位置
			resultlen = max(resultlen, v+1)
		}
		dp[str[i]] = i
		answer = max(answer, i-resultlen+1)
	}
	return answer
}
func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
func main() {
	str := "annooluxj"
	fmt.Println(stringLen(str))
}
