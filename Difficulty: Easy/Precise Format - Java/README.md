<h2><a href="https://www.geeksforgeeks.org/problems/precise-fomat-java/1?page=1&category=Java&sortBy=submissions">Precise Format - Java</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">In many cases, dividing two numbers can contain an excessive number of decimal places. In this problem, your task is to compute the division of two floating-point numbers and format the result to a specific precision.</span></p>
<p><span style="font-size: 14pt;">You are given two floating-point numbers <code>a</code> and <code>b</code>. Your task is to:</span></p>
<ol>
<li><span style="font-size: 14pt;">Output the exact result of <code>a / b</code>.</span></li>
<li><span style="font-size: 14pt;">Format and output the result of <code>a / b</code> rounded to three decimal places.</span></li>
</ol>
<p><span style="font-size: 14pt;">You may use<code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">&nbsp;</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; color: #2dc26b;"><a style="color: #2dc26b;" href="https://www.geeksforgeeks.org/formatted-output-in-java/">System.out.format()</a></span></code> to format the output.</span></p>
<p><span style="font-size: 14pt;">You need to return an ArrayList with two values:</span></p>
<ul>
<li><span style="font-size: 14pt;">The first value is the exact result of <code>a / b</code>.</span></li>
<li><span style="font-size: 14pt;">The second value is the result rounded to three decimal places.</span></li>
</ul>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>a = 5.43, b = 2.653
<strong>Output: </strong>[2.0467393, 2.047]<br><strong>Explanation: </strong>a/b and decimal precision of a/b up to 3 places after the decimal point are given.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> a = 3.25, b = 2.5</span><br><span style="font-size: 14pt;"><strong>Output:</strong> [1.3, 1.300]</span><br><span style="font-size: 14pt;"><strong>Explanation: </strong>a/b and decimal precision of a/b up to 3 places after the decimal point are given.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> a = 10.0, b = 4.0</span><br><span style="font-size: 14pt;"><strong>Output:</strong> [2.5, 2.500]</span><br><span style="font-size: 14pt;"><strong>Explanation: </strong>Division of a by b gives the exact result 2.5 and the formatted result 2.500.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= a, b &lt;= 10<sup>9</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java</code>&nbsp;