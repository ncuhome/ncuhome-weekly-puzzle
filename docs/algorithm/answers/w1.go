package main

import "fmt"

func RepeatNumber (nums []int) int {
	Map := make(map[int]bool)
	for _, v := range nums {
		if v < 0 || v >= len(nums) {
			return -1
		}
		if _, ok :=Map[v]; ok {
			fmt.Println(v)
		}else {
			Map[v] = false
		}
	}
	return 0
}

func CreateArray(n int) []int {
	var array []int
	var number int
	for i:=0; i < n ; i++ {
		fmt.Scanln(&number)
		array = append(array, number)
	}
	return array
}

func main() {
	var n int
	fmt.Scanln(&n)
	var num = CreateArray(n)
	RepeatNumber(num)

}