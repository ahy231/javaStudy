<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<head>
    <title>show product</title>
    <meta charset="UTF-8">
    <style type="text/css">
        body{
            text-align: center;
        }
        table{
            margin: 10px auto;
        }
    </style>
</head>
<body>
    <table>
        <caption>产品目录</caption>
        <tr>
            <th>产品名称</th>
            <th>产品价格</th>
        </tr>
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </table>
</body>