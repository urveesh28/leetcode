<h2><a href="https://www.geeksforgeeks.org/problems/possible-paths-between-2-vertices-1587115620/1?page=3&category=DFS,BFS&sortBy=submissions">Possible paths between 2 vertices</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a <strong>Directed Graph</strong> having <strong>V</strong> nodes numbered from <strong>0</strong>&nbsp;to <strong>V-1</strong>, and E&nbsp;directed edges. Given two nodes,&nbsp;<em><strong>source </strong></em>and <em><strong>destination</strong></em>, count the number of ways or paths between these two vertices in the&nbsp;directed graph. These paths should not&nbsp;contain any cycle.<br><strong>Note:&nbsp;</strong>Graph doesn't contain multiple edges, self-loop, and cycles.</span></p>
<p><br><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong></span><span style="font-size: 18px;">V = 5, E = 7
Adj = [{1,2,4}, {3,4}, {4}, {2}, {}]
source = 0&nbsp;
destination = 4
</span><span style="font-size: 18px;">
<strong>Output:</strong> 4
<strong>Explanation</strong>: 
</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/701246/Web/Other/65d4d77c-2d10-4466-b9c3-9ff5503b6fda_1685086895.png" alt=""><span style="font-size: 18px;">
There are 4 paths from 0 to 4.
0 -&gt; 4
0 -&gt; 1 -&gt; 4
0 -&gt; 2 -&gt; 4
0 -&gt; 1 -&gt; 3 -&gt; 2 -&gt; 4</span>
</pre>
<p><br><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>V = 4, E = 5
Adj = [{1,3}, {2,3}, {3}, {}]
source = 0&nbsp;
destination = 3</span><span style="font-size: 18px;">
<strong>Output:</strong> 3
<strong>Explanation</strong>:
</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/701246/Web/Other/ba0bea3a-cd8c-4429-9f7a-82093d260a53_1685086895.png" alt="">
<span style="font-size: 18px;">There are 3 paths from 0 to 3.
0 -&gt; 3
0 -&gt; 1 -&gt; 3
0 -&gt; 1 -&gt; 2 -&gt; 3
</span></pre>
<p><br><span style="font-size: 18px;"><strong>Your task:</strong><br>You don't need to read, input, or print anything. Your task is to complete the function&nbsp;<strong>countPaths(),</strong>&nbsp;which takes the integer <strong>V</strong> denoting the number of vertices, <a href="https://www.geeksforgeeks.org/graph-and-its-representations/">adjacency list</a>&nbsp;<strong>adj</strong>, integer <strong>source</strong>, and <strong>destination </strong>as input parameters and returns the number of paths in the graph from the source vertex to the destination vertex.</span></p>
<p><br><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(V!)<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(V)</span></p>
<p><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ V, E ≤ 100<br>1 ≤ source, destination&nbsp;≤ V</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>DFS</code>&nbsp;<code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;