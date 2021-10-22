<p>输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。</p>

<p>&nbsp;</p>

<p><strong>示例：</strong></p>

<pre>
<strong>输入：</strong>nums =&nbsp;[1,2,3,4]
<strong>输出：</strong>[1,3,2,4] 
<strong>注：</strong>[3,1,2,4] 也是正确的答案之一。</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ol>
	<li><code>0 &lt;= nums.length &lt;= 50000</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 10000</code></li>
</ol>
<div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>排序</li></div></div><br><div><li>👍 164</li><li>👎 0</li></div>


<p><strong>方法1：</strong></p>

<pre>
新建一个数组newNums[length-1].
从头开始遍历nums[]数组，判断每个数组是奇数还是偶数
奇数：放在newNums[0++]
偶数：放在newNms[length-1--]
</pre>


<p><strong>方法2：</strong></p>

<pre>
n&1 == 1 为奇数，n & 1 == 0 为偶数
while(i < j) {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        满足条件，两个数字进行交换
</pre>

