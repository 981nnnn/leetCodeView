<p>输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>matrix = [[1,2,3],[4,5,6],[7,8,9]]
<strong>输出：</strong>[1,2,3,6,9,8,7,4,5]
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入：</strong>matrix =&nbsp;[[1,2,3,4],[5,6,7,8],[9,10,11,12]]
<strong>输出：</strong>[1,2,3,4,8,12,11,10,9,5,6,7]
</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<ul>
	<li><code>0 &lt;= matrix.length &lt;= 100</code></li>
	<li><code>0 &lt;= matrix[i].length&nbsp;&lt;= 100</code></li>
</ul>

<p>注意：本题与主站 54 题相同：<a href="https://leetcode-cn.com/problems/spiral-matrix/">https://leetcode-cn.com/problems/spiral-matrix/</a></p>
<div><div>Related Topics</div><div><li>数组</li><li>矩阵</li><li>模拟</li></div></div><br><div><li>👍 303</li><li>👎 0</li></div>

<p><strong>示例 2：</strong></p>

<pre>
沿着顺时针方向走（右->下->左->上->），毎走完一行或者一列后, 走过的对应边界也缩小, 不断循环,
以至最后边界无法再缩小时, 循环结束
    比如，向右走完一行，上边界top下移一行；
    向下走完一行，右边界right左移一行；
    向左走完一行，下边界bottom上移一行；
    向上走完一行，左边界left右移一行；

    注意：跳出循环的条件。top < bottom  跳出，left > right 跳出
</pre>