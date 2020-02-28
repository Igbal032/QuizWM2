<%@ page import = "java.util.*, wm2.quiz.Result"%> 
<%
Result result = (Result)session.getAttribute("Result");

%>

<!DOCTYPE html>
<html>
<head>
	<title>Result</title>
</head>
<body>
<div id="mainDiv" style="border:1px solid red; width: 500px; height: 300px">
	<h1>True: <%=result.getTrue()%></h1>
	<h1>False: <%=result.getFalse()%></h1>
	<h1>Total Score: <%=result.getTotalScore()%></h1>
</div>
</body>
</html>