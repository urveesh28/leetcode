<h2><a href="https://www.geeksforgeeks.org/problems/arraylist-operations/1?page=7&category=Java&sortBy=submissions">ArrayList Operations</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">In this question we will be implementing <strong>q&nbsp;</strong>number&nbsp;operations on ArrayList. There will be different type of queries.<br>A query can be of&nbsp;five&nbsp;types:<br>1. a x (Adds an element x to the ArrayList A&nbsp;at the end)<br>2. b (Sorts the ArrayList A in ascending order)<br>3. c (Reverses the ArrayList A)<br>4. d (prints the size of the ArrayList)<br>5. e (Sorts the ArrayList A in descending order)<br>6. f&nbsp;&nbsp;</span><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">(prints space separated values of the ArrayList)</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>q = 6, queries = "a 4 a 6 a 7 b c e"<br></span><span style="font-size: 18px;"><strong>Output</strong>: 7 6 4<br></span><span style="font-size: 18px;"><strong>Explanation:</strong>
There are six queries.
Queries are performed in this order
1. a 4 {ArrayList has 4}
2. a 7 {ArrayList has 4,7}
3. a 6 {ArrayList has 4,7,6}
4. b {sorts the ArrayList in ascending order,
&nbsp;     ArrayList now is 4 6 7}
5. c {reverse the ArrayList to 7 6 4}
6. e {prints the elements of ArrayList i.e. 7 6 4}</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>q = 4, queries = "a 55 a 11 d e"<br></span><span style="font-size: 18px;"><strong>Output</strong>: 2 55 11</span>
<span style="font-size: 18px;"><strong>Explanation :</strong>
There are four queries.
Queries are performed in this order
1. a 55 {ArrayList has 55}
2. a 11 {ArrayList has 55,11}
3. d {prints the size of the ArrayList i.e. 2}
4. e {prints the elements of ArrayList i.e. 55 11}</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;=Q&lt;=100</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java</code>&nbsp;<code>Java-Collections</code>&nbsp;