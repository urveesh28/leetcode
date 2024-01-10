<h2><a href="https://leetcode.com/problems/row-with-maximum-ones/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2643. Row With Maximum Ones</a></h2><h3>Easy</h3><hr><div><p>Given a <code>m x n</code> binary matrix <code>mat</code>, find the <strong>0-indexed</strong> position of the row that contains the <strong>maximum</strong> count of <strong>ones,</strong> and the number of ones in that row.</p>

<p>In case there are multiple rows that have the maximum count of ones, the row with the <strong>smallest row number</strong> should be selected.</p>

<p>Return<em> an array containing the index of the row, and the number of ones in it.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> mat = [[0,1],[1,0]]
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (1<code>)</code>. So, the answer is [0,1]. 
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> mat = [[0,0,0],[0,1,1]]
<strong>Output:</strong> [1,2]
<strong>Explanation:</strong> The row indexed 1 has the maximum count of ones <code>(2)</code>. So we return its index, <code>1</code>, and the count. So, the answer is [1,2].
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> mat = [[0,0],[1,1],[0,0]]
<strong>Output:</strong> [1,2]
<strong>Explanation:</strong> The row indexed 1 has the maximum count of ones (2). So the answer is [1,2].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == mat.length</code>&nbsp;</li>
	<li><code>n == mat[i].length</code>&nbsp;</li>
	<li><code>1 &lt;= m, n &lt;= 100</code>&nbsp;</li>
	<li><code>mat[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>
</div>