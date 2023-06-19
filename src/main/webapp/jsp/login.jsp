<%--
  Created by IntelliJ IDEA.
  User: 13338802780
  Date: 2023/6/15
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    function check(){
        var username =$("#username").val();
        var password =$("#password").val();
        if(username==""||password==""){
            $("#message").text("账号或密码不能为空！");
            return false;
        }
        return true;
    }
</script>
<form action="${pageContext.request.contextPath} /login.action" method="post" onsubmit="return check()">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/><br/>
    账&nbsp;号:<input id="username" type="text" name="username"><br/><br/>
    密&nbsp;码:<input id="password" type="text" name="password"><br/><br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <center><input type="submit" value="登录"></center>
</form>
</body>
</html>
