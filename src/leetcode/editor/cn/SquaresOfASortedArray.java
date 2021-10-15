package leetcode.editor.cn;

//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
// Related Topics 数组 双指针 排序 👍 322 👎 0

public class SquaresOfASortedArray{
    public static void main(String[] args) {
        Solution solution = new SquaresOfASortedArray().new Solution();
        int [] nums = {1,3,2,7,3};
        int[] sort = solution.sortedSquares(nums);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] newNums=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i]*nums[i];
        }
        if(nums.length<=1){
            return newNums;
        }
        return sort(newNums);
    }
    public int[] sort(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    int flag = nums[i];
                    nums[i]= nums[j];
                    nums[j] = flag;
                }
            }
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}