<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<form:form method="post" action="login.htm" commandName="loginModel">
   Username:<form:input path="username" />
	<form:errors path="username" cssStyle="color:red"></form:errors>
	<BR>
   Password:<form:password path="password" />
	<form:errors path="password" cssStyle="color:red"></form:errors>
	<BR>
	<input type="submit" value="Login" />
</form:form>

