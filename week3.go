package main

import (
	"fmt"
	"strings"
)

func main(){
	var s string
	var Length int
	var s1 string
	fmt.Scan(&s)
	left := 0
	right := 0
	s1 = s[left:right]
	for ; right < len(s); right++ {

		//IndexByte返回s1中s[right]的索引，如果没有返回-1
		if index := strings.IndexByte(s1, s[right]); index != -1 {
			left += index + 1
		}
		s1 = s[left : right+1]
		if len(s1) > Length {
			Length = len(s1)
		}
	}

	fmt.Println(Length)



}



