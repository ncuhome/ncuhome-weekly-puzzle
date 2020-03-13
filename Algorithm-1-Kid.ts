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
}

const findDuplicate3 = (arr: number[]) => {
  for (const i of arr) {
    if (arr.find((j, k) => i === j && arr.indexOf(i) !== k)) return i
  }
}

const findDuplicate4 = (arr: number[]) => {
  for (const i of arr) {
    if (arr.findIndex((j, k) => i === j && arr.indexOf(i) !== k) > 0) return i
  }
}
