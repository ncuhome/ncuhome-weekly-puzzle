package main

import "fmt"

func numsofIsland(arr [][]int) int {
	count := 0
	for i, _ := range arr {
		for j, _ := range arr[i] {
			if arr[i][j] == 1 {
				count++
				DFS(arr, i, j)
			}
		}
	}
	return count
}

func DFS(arr [][]int, i, j int) {
	if i < 0 || i >= len(arr) || j < 0 || j >= len(arr[i]) {
		return
	}
	if arr[i][j] != 1 {
		return
	}
	arr[i][j] = 2
	DFS(arr, i+1, j)
	DFS(arr, i-1, j)
	DFS(arr, i, j+1)
	DFS(arr, i, j-1)
}
func main() {
	arr1 := [][]int{
		{1, 0, 0},
		{0, 1, 0},
		{1, 0, 1},
		{0, 1, 0},
	}
	fmt.Println(numsofIsland(arr1))
}
