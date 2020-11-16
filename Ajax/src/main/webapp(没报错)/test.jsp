<!--
 * @Author: ahy231
 * @Date: 2020-11-14 15:46:41
 * @LastEditors: ahy231
 * @LastEditTime: 2020-11-15 10:35:29
-->
<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=1600px, initial-scale=1.0">
    <title>test</title>
    <%
        String name = request.getParameter("name");
    %>
</head>
<body>
    <%=name%>
</body>
</html>