<%@ page session="false"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<body>
	<h3>
		Welcome To Ramesh Technologies...
		<core:out value="${loginModel.username}" />
	</h3>
	<table>
		<tr>
			<td><a href="login.htm">Back</a>
			</td>
		</tr>
	</table>
</body>
</html>
