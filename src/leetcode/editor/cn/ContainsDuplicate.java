package leetcode.editor.cn;

//给定一个整数数组，判断是否存在重复元素。 
//
// 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。 
//
// 
//
// 示例 1: 
//
// 
//输入: [1,2,3,1]
//输出: true 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4]
//输出: false 
//
// 示例 3: 
//
// 
//输入: [1,1,1,3,3,4,3,2,4,2]
//输出: true 
// Related Topics 数组 哈希表 排序 👍 510 👎 0

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class ContainsDuplicate{
    public static void main(String[] args) {
        Solution solution = new ContainsDuplicate().new Solution();
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(solution.containsDuplicate(nums));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    /**
     * 使用set
      * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        HashSet set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
           if(nums[i]==nums[i+1]){
               return true;
           }
        }
        return false;
    }

    public boolean containsDuplicate(int []nums){
        return IntStream.of(nums).distinct().count() != nums.length;
    }

}

//leetcode submit region end(Prohibit modification and deletion)

}