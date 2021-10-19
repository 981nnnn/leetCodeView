<p>请实现一个函数，把字符串 <code>s</code> 中的每个空格替换成&quot;%20&quot;。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>s = &quot;We are happy.&quot;
<strong>输出：</strong>&quot;We%20are%20happy.&quot;</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<p><code>0 &lt;= s 的长度 &lt;= 10000</code></p>
<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 166</li><li>👎 0</li></div>

<p><strong>方法1：</strong></p>

<pre>
直接暴力解法，new StringBuiler对象，如果 char[index] 是空字符，直接append("%20")。 返回sb.toString()
</pre>

<p><strong>方法2：</strong></p>
<pre>
使用String.replace(" ","%20")，直接替换字符串中的空字符。
</pre>

<p><strong>方法3：</strong></p>

<pre>
定义一个length是字符串三倍的char数组。（3倍保证如果字符都是空字符，char数组可以装下所有的字符）
循环遍历字符串的每个数字
 for (char c : chars) {
            if(c==' '){
                newChars[size++] = '%';
                newChars[size++] = '2';
                newChars[size++] = '0';
            }else{
                newChars[size++] = c;
            }
        }
  //字符数组转字符串
  new String(newChars,0,size).return;
</pre>