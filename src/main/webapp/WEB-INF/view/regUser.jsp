<%--
  Created by IntelliJ IDEA.
  User: Ron
  Date: 17/11/2018
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 align="center">User registration </h1>

<form action="registerUser" method="post">

Id <input type="text" name="id"/><br/>
Name<input type="text" name="name"/><br/>
Email<input type="text" name="email"/><br/>
<input type="submit" value="Register"/>

${result}


</form>

</body>
</html>
