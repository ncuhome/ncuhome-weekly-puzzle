// 题目描述
// 在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字，语言不限。

// 举例
// 输入：[2, 3, 1, 0, 2, 5, 3]

// 返回：2


const randomizeArray = (arr: number[]) => {
  arr.sort(() => Math.random() - 0.5)
  return arr
}

const findFirstDuplicatedNum = (arr: number[]) => {
  for (let i = 0; i < arr.length; i++) {
    if (i >= 0 && arr.indexOf(arr[i], i + 1) > 0) return arr[i]
  }
}

const main = () => {
  const arr = [2, 3, 1, 0, 2, 5, 3]
  const randomizedArray = randomizeArray(arr)
  const result = findFirstDuplicatedNum(randomizedArray)
  return result
}

console.log(main())
