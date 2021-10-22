package leetcode.editor.cn;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 矩阵 模拟 👍 303 👎 0

import java.util.Arrays;

public class ShunShiZhenDaYinJuZhenLcof{
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        int [][]matrix = { {1,2,3},{4,5,6},{7,8,9}};
        solution.spiralOrder(matrix);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return new int[0];
        }
       int top = 0;
       int left = 0;
       int right = matrix[0].length-1;
       int bottom = matrix.length-1;
       int length = matrix[0].length*matrix.length;
       int [] result = new int[length];
       int index = 0;
       while (true){
           // 从左到右
           for (int i = left; i <= right; i++) {
               result[index++] = matrix[top][i];
           }
            if(++top>bottom){
                break;
            }
           // 从上到下
           for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
           }
           if(--right < left){
               break;
           }

           // 从右到左
           for (int i = right ; i >=left ; i--) {
               result[index++] = matrix[bottom][i];
           }
           if(--bottom<top){
               break;
           }

           // 从下到上
           for (int i = bottom ; i >=top ; i--) {
                result[index++] = matrix[i][left];
           }
           if(++left>right){
               break;
           }
       }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}