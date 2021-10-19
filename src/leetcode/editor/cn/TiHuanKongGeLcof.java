package leetcode.editor.cn;

//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 👍 166 👎 0

public class TiHuanKongGeLcof{
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
        System.out.println(solution.replaceSpace("We are happy."));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
    public String replaceSpace1(String s) {
        char[] chars = s.toCharArray();
        s="";
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==' '){
                s+="%20";
            }else{
                s+=chars[i];
            }
        }
        return s;
    }
    public String replaceSpace2(String s) {
        // 字符串转字符数组
        char[] chars = s.toCharArray();
        // 假设每个元素都是空字符，扩容为3倍
        char[] newChars = new char[chars.length*3];
        int size = 0;
        for (char c : chars) {
            if(c==' '){
                newChars[size++] = '%';
                newChars[size++] = '2';
                newChars[size++] = '0';
            }else{
                newChars[size++] = c;
            }
        }
        // 字符数组转字符串
        return new String(newChars, 0, size);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}