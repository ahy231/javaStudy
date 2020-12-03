<!--
 * @Author: ahy231
 * @Date: 2020-12-03 15:00:34
 * @LastEditors: ahy231
 * @LastEditTime: 2020-12-03 15:36:43
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=800px, initial-scale=1.0">
    <title>addProduct</title>
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <style type="text/css">
    body {
        text-align: center;
    }
    form {
        margin: 5% auto;
        border: 5px solid red;
        border-radius: 10px;
        padding: 5%;
        padding-top: 2%;
        padding-bottom: 1%;
        left: 40%;
        width: 20%;
    }
    </style>
</head>
<body>
    <form action="addProduct">
        产品名称：<input class="form-control" type="text" name="name" value=""><br>
        产品价格：<input class="form-control" type="text" name="price" value=""><br>
        <input class="btn btn-success" type="submit" value="增加商品">
    </form>
</body>
</html>