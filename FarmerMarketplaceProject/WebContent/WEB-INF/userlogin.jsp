<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
<div align="center">
        <h1>Login By User</h1>
        <form:form  action="userloginchecking.html" method="get" modelAttribute="login">
       
        <table>
            
            <tr>
                <td>Username:</td>
                <td><form:input path="username" />
	   <font color="red"> <form:errors path="username"></form:errors></font></td>
            </tr>

             <tr>
                <td>Password:</td>
                <td><form:input path="password" />
                <font color="red"> <form:errors path="password"></form:errors></font></td>
            </tr>
            <tr>
            </tr>
             <tr>
                <td colspan="2" align="center"><input type="submit" value="Login"></td>
        
            </tr>
        </table>
       
</form:form>

</body>
</html>