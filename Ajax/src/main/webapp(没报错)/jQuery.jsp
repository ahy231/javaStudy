<!--
 * @Author: ahy231
 * @Date: 2020-11-15 08:59:51
 * @LastEditors: ahy231
 * @LastEditTime: 2020-11-15 15:14:22
-->
<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!-- html中没有pageContext对象，因此会显示404错误 -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=1600px, initial-scale=1.0">
    <title>jQuery Ajax</title>
    <script src="https://how2j.cn/study/jquery.min.js"></script>
</head>

<body>
    <input type="text" placeholder="请输入名字" id="input"><br>
    <span id="result"></span>
</body>

<script>
    $(function () {
        $("#input").keyup(
            function () {
                $.ajax({
                    url: '${pageContext.request.contextPath}/test.jsp',
                    data: { 'name': $("#input").val() },
                    success: function (result) {
                        $("#result").html(result);
                    }
                })
            }
            // 如果直接将$.ajax()传入，会发生错误如下
            // ((x.event.special[o.origType] || {}).handle || o.handler).apply is not a function
        )
    })
</script>

</html>