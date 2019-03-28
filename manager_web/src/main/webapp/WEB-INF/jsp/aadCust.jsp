<%--
  Created by IntelliJ IDEA.
  User: ZXQ
  Date: 2019/3/26
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/cust/addCust"  method="post">
    姓名：<input type="text" name="name"><br/>
    密码：<input type="text" name="password"><br/>
    电话：<input type="text" name="phone"><br/>
    地址：<input type="text" name="adress"><br/>
    <input type="submit" value="提交 ">
</form>
</body>
</html>
