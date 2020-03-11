/** 
 * @name findAnyDuplicate
 * @param {number[]} nums
 * @return {number}
*/
const findAnyDuplicate = (nums) => {
  const hash = {}

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] in hash)
      return nums[i]

    hash[nums[i]] = true
  }

  return -1
}

const randOrder = () => Math.random() - 0.5

const testRes = () => {
  const len = 1000
  let arr = [...new Array(len)].map((_, i) => i)

  const proper = (arr.sort(randOrder))[0]

  arr = [...arr, proper].sort(randOrder)

  const yours = findAnyDuplicate(arr)

  console.log(proper, yours)

  if (proper !== yours)
    return 1
    
  return 0
}

const main = () => {
  const total = 1000;
  let count = 0
  for (let i = 0; i < total; i++) {
    count += testRes()
  }
  console.log(`total count: ${total}, failed count: ${count}`)
}

main()
