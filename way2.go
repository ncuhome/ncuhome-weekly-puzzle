package main

import "fmt"

func Array1(nums []int) int {
	for a1,_:=range nums{
		for a2,_:=range nums{
			if a1==a2{
				return a1
			}
		}
	}
	return 0
}
func main(){
	array:=[]int{2,2,1}
	answer:=Array1(array)
	fmt.Println(answer)
}