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
    &ndsp;
</form>
</body>
</html>
