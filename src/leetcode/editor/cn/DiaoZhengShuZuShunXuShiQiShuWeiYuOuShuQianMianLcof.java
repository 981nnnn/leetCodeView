package leetcode.editor.cn;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。 
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 0 <= nums[i] <= 10000 
// 
// Related Topics 数组 双指针 排序 👍 164 👎 0

public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof{
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
       int [] nums = {1,2,3,4};
        solution.exchange1(nums);
        System.out.println(1&1);
        System.out.println(2&1);
        System.out.println(3&1);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        int [] newNums = new int[nums.length];
        int last = newNums.length-1;
        int first = 0;
        for (int num : nums) {
            if(num%2==0){
                newNums[last--] = num;
            }else{
                newNums[first++] = num;
            }
        }
        return newNums;
    }

    /**
     * n&1==1 为奇数
     * n&1==9 为偶数
     * @param nums
     * @return
     */
    public int[] exchange1(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}