<h2><a href="https://leetcode.com/problems/separate-black-and-white-balls/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2938. Separate Black and White Balls</a></h2><h3>Medium</h3><hr><div><p>There are <code>n</code> balls on a table, each ball has a color black or white.</p>

<p>You are given a <strong>0-indexed</strong> binary string <code>s</code> of length <code>n</code>, where <code>1</code> and <code>0</code> represent black and white balls, respectively.</p>

<p>In each step, you can choose two adjacent balls and swap them.</p>

<p>Return <em>the <strong>minimum</strong> number of steps to group all the black balls to the right and all the white balls to the left</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "101"
<strong>Output:</strong> 1
<strong>Explanation:</strong> We can group all the black balls to the right in the following way:
- Swap s[0] and s[1], s = "011".
Initially, 1s are not grouped together, requiring at least 1 step to group them to the right.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "100"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We can group all the black balls to the right in the following way:
- Swap s[0] and s[1], s = "010".
- Swap s[1] and s[2], s = "001".
It can be proven that the minimum number of steps needed is 2.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "0111"
<strong>Output:</strong> 0
<strong>Explanation:</strong> All the black balls are already grouped to the right.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n == s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s[i]</code> is either <code>'0'</code> or <code>'1'</code>.</li>
</ul>
</div>