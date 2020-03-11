package main

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"strconv"
)

func find(arr []int) int {
	arrLen := len(arr)
	for _, v := range arr {
		if v >= arrLen {
			v -= arrLen
		}
		if arr[v] >= arrLen {
			return v
		}
		arr[v] += arrLen
	}
	return -1
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Please enter an array (which can contain Spaces but must have '[', ']' and ',') as follows: [2, 3, 1, 0, 2, 5, 3]")
	arrStr, _ := reader.ReadString('\n')
	reg := regexp.MustCompile(`\s`)
	arrByte := []byte(reg.ReplaceAllString(string(arrStr), ""))
	arrLen := (len(arrByte) - 1) / 2
	arr := make([]int, arrLen)
	for k := range arr {
		arr[k], _ = strconv.Atoi(string(arrByte[k * 2 + 1]))
	}
	// 上面这些都没啥用
	if res := find(arr); res < 0 {
		fmt.Println("None")
	} else {
		fmt.Println(res)
	}
}