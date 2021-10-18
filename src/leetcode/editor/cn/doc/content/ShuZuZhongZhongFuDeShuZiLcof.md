<p>找出数组中重复的数字。</p>

<p><br>
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>
[2, 3, 1, 0, 2, 5, 3]
<strong>输出：</strong>2 或 3 
</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<p><code>2 &lt;= n &lt;= 100000</code></p>
<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>排序</li></div></div><br><div><li>👍 576</li><li>👎 0</li></div>

<p><strong>方法 1：</strong></p>

<pre>
1.循环遍历到数组，将元素放入set中(set集合元素不重复，如果存在就是添加失败，直接返回当前遍历的元素)
2.循环遍历数组，将元素放入map的key中，key不重复，允许有一个null。如果map.containes(value)返回true，说明map的key中已经存在。直接返回该value。
</pre>