package main

import "fmt"

func findNumber(nums []int) int {
	maps := make(map[int]bool)
	for _, v := range nums {
		if maps[v] {
			return v
		} else {
			maps[v] = true
		}
	}
	return -1
}
func main() {
	array := []int{9, 9, 10, 2, 5, 6, 3}
	fmt.Println(findNumber(array))
}
