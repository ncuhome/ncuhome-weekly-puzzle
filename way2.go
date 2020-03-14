package main

import "fmt"

func Array1(nums []int) int {
	maps:=make(map[int]bool)
	for _,j:=range nums{
		if maps[j] {
			return j
		}else {
			maps[j]=true
		}
	}
	return -1
}
func main(){
	array:=[]int{3,1,2,3}
	answer:=Array1(array)
	fmt.Println(answer)
}