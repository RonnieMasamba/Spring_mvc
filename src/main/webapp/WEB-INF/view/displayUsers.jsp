<%--
  Created by IntelliJ IDEA.
  User: Ron
  Date: 18/11/2018
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>email</td>
    </tr>
<c:forEach items="${users}" var="user">

     ${user.id}
     ${user.name}
     ${user.email}

</c:forEach>
</table>
</body>
</html>
