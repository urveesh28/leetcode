<h2><a href="https://www.geeksforgeeks.org/problems/java-collection-set-3-hashmap/1?page=6&category=Java&sortBy=submissions">HashMap Operations</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Implement different operations on Hashmap. Different types of <strong>queries</strong> will be provided.<br>A query can be of four&nbsp;types:<br>1. <strong>a x y</strong>&nbsp;(adds an entry&nbsp;with key x and value&nbsp;y to the Hashmap)<br>2. <strong>b x</strong> (print value of &nbsp;x if&nbsp;present in the Hashmap else print -1.&nbsp;)<br>3. <strong>c</strong> (prints the size of the Hashmap)<br>4. <strong>d x</strong> (removes an entry&nbsp;with key x from the Hashmap)</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span><span style="font-size: 18px;"> </span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>:</span><span> <span style="font-size: 14pt;">queries[][] = [["</span></span><span style="font-size: 18px;">a 1 2"], ["a 66 3"], ["b 66"], ["d 1"], ["c"]] </span>
<span style="font-size: 18px;"><strong>Output</strong>: </span><span style="font-size: 18px;">3 1 </span>
<span style="font-size: 18px;"><strong>Explanation :</strong>
There are five queries. Queries are performed in this order
1. a 1 2  ---&gt;  map has a key 1 with value 2
2. a 66 3 ---&gt; map has a key 66 with value 3
3. b 66   ---&gt; prints the value of key 66 if its present in the map ie 3.
4. d 1    ---&gt; removes an entry from map with key 1
5. c      ---&gt; prints the size of the map ie 1</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: </span><span style="font-size: 14pt;">queries[][] = [["</span><span style="font-size: 18px;">a 1 66"], ["b 5"], ["c"]]</span>
<span style="font-size: 18px;"><strong>Output</strong>: </span><span style="font-size: 18px;">-1 1</span>
<span style="font-size: 18px;"><strong>Explanation :</strong>
There are three queries. Queries are performed in this order
1. a 1 66 ---&gt; adds a key 1 with a value of 66 in the map
2. b 5    ---&gt;  since the key 5 is not present in the map hence -1 is printed.
3. c      ---&gt; prints the size of the map ie 1</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= queries &lt;= 100</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java</code>&nbsp;<code>Java-Collections</code>&nbsp;