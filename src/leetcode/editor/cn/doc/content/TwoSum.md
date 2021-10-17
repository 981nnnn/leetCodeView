<p>给定一个整数数组 <code>nums</code> 和一个整数目标值 <code>target</code>，请你在该数组中找出 <strong>和为目标值 </strong><em><code>target</code></em>  的那 <strong>两个</strong> 整数，并返回它们的数组下标。</p>

<p>你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。</p>

<p>你可以按任意顺序返回答案。</p>

<p> </p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>nums = [2,7,11,15], target = 9
<strong>输出：</strong>[0,1]
<strong>解释：</strong>因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,2,4], target = 6
<strong>输出：</strong>[1,2]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>nums = [3,3], target = 6
<strong>输出：</strong>[0,1]
</pre>

<p> </p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>2 <= nums.length <= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code></li>
	<li><strong>只会存在一个有效答案</strong></li>
</ul>

<p><strong>进阶：</strong>你可以想出一个时间复杂度小于 <code>O(n<sup>2</sup>)</code> 的算法吗？</p>
<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li></div></div><br><div><li>👍 12359</li><li>👎 0</li></div>



<p><strong>方法1：</strong></p>

<pre>
暴力枚举：循环遍历两次。
时间复杂度是O(x^2^)
空间复杂度是O(1)
</pre>

<p><strong>方法2：</strong></p>

<pre>
使用map的key
key存储当前元素的值，value存储当前的索引
当有target-num[i] 在map的key中存在，结束遍历。取出对应key的value。返回value与当前索引
</pre>