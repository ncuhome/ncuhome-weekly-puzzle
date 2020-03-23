package main

import (
"fmt"
)


func Max(x, y int) int {
	if x < y {
		return y
	}else {
		return x
	}
}

//得到数组
func CreateArray(n int) []int {
	var array []int
	var number int
	for i:=0; i < n ; i++ {
		fmt.Scanln(&number)
		array = append(array, number)
	}
	return array
}

//最长上升子序列长度
func LongestAscendingSubsequence(array []int)  int {
	if len(array) == 0 {
		return 0
	}
	var length int
	var long = []int{1}
	for i := 1; i<len(array); i++ {
		length = 1
		for j := 0; j<i; j++ {
			if array[j] < array[i] {
				length = Max(length, long[j]+1)
			}
		}
		long = append(long, length)
	}
	return long[len(array)-1]
}


func main() {
	var n int
	var Arrays []int
	fmt.Scanln(&n)
	Arrays = CreateArray(n)
	fmt.Println(LongestAscendingSubsequence(Arrays))
}