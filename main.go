package main

import "fmt"

func Array(nums []int) int {
	count:=1
	for i:=0;i<len(nums);i++{
		for _ ,j:=range nums{
			if nums[i]==j {
				count++
			}
		}
		if count>1{
			return nums[i]
		}
	}
	return -1
}
func main(){
	thearray:=[]int{2,3,0,1,2,5,3}
	judge:=Array(thearray)
	fmt.Println(judge)
}

