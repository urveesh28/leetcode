<h2><a href="https://leetcode.com/problems/root-equals-sum-of-children/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2236. Root Equals Sum of Children</a></h2><h3>Easy</h3><hr><div><p>You are given the <code>root</code> of a <strong>binary tree</strong> that consists of exactly <code>3</code> nodes: the root, its left child, and its right child.</p>

<p>Return <code>true</code> <em>if the value of the root is equal to the <strong>sum</strong> of the values of its two children, or </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/04/08/graph3drawio.png" style="width: 281px; height: 199px;">
<pre><strong>Input:</strong> root = [10,4,6]
<strong>Output:</strong> true
<strong>Explanation:</strong> The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return true.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/04/08/graph3drawio-1.png" style="width: 281px; height: 199px;">
<pre><strong>Input:</strong> root = [5,3,1]
<strong>Output:</strong> false
<strong>Explanation:</strong> The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
5 is not equal to 3 + 1, so we return false.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The tree consists only of the root, its left child, and its right child.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>
</div>