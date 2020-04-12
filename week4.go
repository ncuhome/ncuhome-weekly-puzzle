package main

import "fmt"

func Count(n int) int {
	array := make([]int,n+1)
	if n == 0 {
		return 1
	} else if n==1{
		return 1
	} else{
		array[0]=0
		array[1]=1
		array[2]=2
		for i := 3; i < n+1; i++ {
			array[i] = (array[i-1] + array[i-2])%1000000007
		}
	}
	return array[n]
}

func main() {
	var num int
	fmt.Println("input a number")
	fmt.Scanf("%d", &num)
	fmt.Println(Count(num))
}
