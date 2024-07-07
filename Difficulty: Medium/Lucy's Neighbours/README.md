<h2><a href="https://www.geeksforgeeks.org/problems/lucys-neighbours--141631/1?page=2&category=Heap&sortBy=submissions">Lucy's Neighbours</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Lucy lives in house number <strong>x</strong>. She has a list of <strong>n</strong> house numbers in the society. Distance between houses can be determined by studying the difference between house numbers. Help her find out <strong>k</strong> closest neighbors. Return the list of house numbers in sorted order.<br><strong>Note: </strong>If two houses are equidistant and Lucy has to pick only one, the house with the smaller house number is given preference.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 5, x = 0, k = 4, arr[] = [-21, 21, 4, -12, 20] </span>
<span style="font-size: 18px;"><strong>Output: </strong>-21 -12 4 20</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>The closest neighbour is house number 4. Followed by -12 and 20. -21 and 21 are both equal distance from X=0. Therefore, Lucy can only pick 1. Based on the given condition she picks -21 as it is the smaller of the two. </span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 6, x = 5, k = 3</span>, <span style="font-size: 18px;">arr[] = [10, 2, 14, 4, 7, 6]</span>
<span style="font-size: 18px;"><strong>Output: </strong>4 6 7</span> 
</pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n log n)<br><strong>Expected Auxiliary Space:</strong> O(n)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ k ≤ n ≤ 10<sup>5</sup>&nbsp;<br>-10<sup>4</sup> ≤ x, arr[i] ≤ 10<sup>4</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Heap</code>&nbsp;<code>Data Structures</code>&nbsp;