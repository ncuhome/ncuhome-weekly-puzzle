package main

import (
	"fmt"
	"strings"
)

func main() {
	var maxLen, left, right int
	var s, sC string
	fmt.Scanln(&s)
	sC = s[left:right]
	for ; right < len(s); right++ {
		if index := strings.IndexByte(sC, s[right]); index != -1 {
			left += index + 1
		}
		sC = s[left : right+1]
		if len(sC) > maxLen {
			maxLen = len(sC)
		}
	}
	fmt.Println(maxLen)
}