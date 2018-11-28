<%--
  Created by IntelliJ IDEA.
  User: Ron
  Date: 26/11/2018
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>User_Id</th>
        <th>Username</th>
        <th>Email</th>
    </tr>




        <tr>
            <td>${user.id}</td>
            <td><${user.name}</td>
            <td>${user.email}</td>
        </tr>
</table>
</body>
</html>
