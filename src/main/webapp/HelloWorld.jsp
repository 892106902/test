<%--
  Created by IntelliJ IDEA.
  User: bcsoft
  Date: 2015/12/2
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello world</title>

</head>
<body>
<h2><s:iterator value="users">
    <s:property value="id"></s:property>
    <s:property value="code"></s:property>
    <s:property value="name"></s:property>
    </br>
</s:iterator></h2>
</body>
</html>
