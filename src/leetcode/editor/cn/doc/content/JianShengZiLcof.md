<p>给你一根长度为 <code>n</code> 的绳子，请把绳子剪成整数长度的 <code>m</code> 段（m、n都是整数，n&gt;1并且m&gt;1），每段绳子的长度记为 <code>k[0],k[1]...k[m-1]</code> 。请问 <code>k[0]*k[1]*...*k[m-1]</code> 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入: </strong>2
<strong>输出: </strong>1
<strong>解释: </strong>2 = 1 + 1, 1 &times; 1 = 1</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre><strong>输入: </strong>10
<strong>输出: </strong>36
<strong>解释: </strong>10 = 3 + 3 + 4, 3 &times;&nbsp;3 &times;&nbsp;4 = 36</pre>

<p><strong>提示：</strong></p>

<ul>
	<li><code>2 &lt;= n &lt;= 58</code></li>
</ul>

<p>注意：本题与主站 343 题相同：<a href="https://leetcode-cn.com/problems/integer-break/">https://leetcode-cn.com/problems/integer-break/</a></p>
<div><div>Related Topics</div><div><li>数学</li><li>动态规划</li></div></div><br><div><li>👍 310</li><li>👎 0</li></div>

<p><strong>示例&nbsp;2:</strong></p>

<pre>
参考链接：
https://leetcode-cn.com/problems/jian-sheng-zi-lcof/solution/mian-shi-ti-14-i-jian-sheng-zi-tan-xin-si-xiang-by/
个人理解：
尽可能将绳子以长度 33 等分为多段时，乘积最大。
出现三种情况：
最优：每段绳子长度都是三，直接相乘。
次优：最后一段绳子是2, 3*2>3*1*1,3*3*2>3*5 所以不需要拆分为1+1 。直接3*3*3*...*3*2
最差：最后一段绳子是1： 3*3*1 < 3*4 ,所以将最后一段绳子加到倒数第二个。3*3*3*。。。3*3*4；
</pre>