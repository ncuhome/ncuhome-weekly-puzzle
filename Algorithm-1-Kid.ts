const findDuplicate1 = (arr: number[]) => {
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] === arr[j]) return arr[i]
    }
  }
}

const findDuplicate2 = (arr: number[]) => {
  for (let i = 0; i < arr.length; i++) {
    if (arr.indexOf(arr[i], i + 1) > 0) return arr[i]
  }
  /*
   * 也可以改写成 Array.prototype.find：
   * for (const i of arr) {
   *   if (arr.find((j, k) => i === j && arr.indexOf(i) !== k)) return i
   * 或者 Array.prototype.findIndex：
   *   if (arr.findIndex((j, k) => i === j && arr.indexOf(i) !== k) > 0) return i
   * }
   */
}

const findDuplicate3 = (arr: number[]) => {
  const set = new Set()
  for (const num of arr) {
    const before = set.size
    set.add(num)
    if (set.size === before) return num
  }
  /*
   * 也可以直接用数组：
   * const set = []
   *  for (const num of arr) {
   *    if (set.indexOf(num) >= 0) return num
   *    set.push(num)
   * }
   */
  }
}

const findDuplicate4 = (arr: number[]) => {
  for (let i = 0; i < arr.length; i++) {
    const curr = arr[i]
    if (curr !== i) {
      if (curr === arr[curr]) return curr
      ;[arr[i], arr[curr]] = [arr[curr], arr[i]]
    }
  }
}
