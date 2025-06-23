var productExceptSelf = function(nums) {
    let leftToRight = []
    let rightToLeft = []
    let final = []
    let cumLeft = 1
    let cumRight = 1
    for (let i =0; i < nums.length; i++){
        let j = nums.length - i - 1
        cumLeft *= nums[i]
        cumRight *= nums[j]
        leftToRight[i] = cumLeft
        rightToLeft[j] = cumRight
    }
    for (let i =1; i < nums.length-1; i++){
        final[i-1] = leftToRight[i-1] * rightToLeft[i+1]
    }
    return [rightToLeft[1],...final, leftToRight[nums.length-2]]
};