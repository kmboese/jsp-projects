<html>

<body>

<h3>Printing the Fibonacci sequence</h3>
Note: Limited to first 128 Fibonacci numbers. <br/>


<%!
long fib(int n) {
	long[] values = new long[128];
	
	if (n == 0 || n == 1) {
		return 1;
	}
	
	values[0] = 1;
	values[1] = 1;
	int count = 2;
	
	while (n >= count) {
		values[count] = values[count-1] + values[count-2];
		count++;
	}
	
	return values[n];
}
%>

The 12th Fibonacci number is <%= fib(12) %>

</body>

</html>