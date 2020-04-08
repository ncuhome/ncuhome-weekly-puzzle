package main

import "fmt"

func Length(nums []int) int {
	n := []int{}
	for i:=0;i<len(nums);i++{
		n=append(n,1)
	}
	answer:=0
	for i:=1;i<len(nums);i++{
		for j:=0;j<i;j++{
			if nums[i]>nums[j]{
				n[i]=Max(n[i],n[j]+1)
			}
		}
		answer=Max(answer,n[i])
	}
	return answer
}
func Max(a,b int)int{
	if a>b{return a}
	return b
}
func main(){
	c:=[]int{9,10,32,1,4,6,9}
	fmt.Println(Length(c))
}