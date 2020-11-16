<!--
 * @Author: ahy231
 * @Date: 2020-11-15 08:59:51
 * @LastEditors: ahy231
 * @LastEditTime: 2020-11-15 15:14:22
-->
<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!-- html��û��pageContext������˻���ʾ404���� -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=1600px, initial-scale=1.0">
    <title>jQuery Ajax</title>
    <script src="https://how2j.cn/study/jquery.min.js"></script>
</head>

<body>
    <input type="text" placeholder="����������" id="input"><br>
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
            // ���ֱ�ӽ�$.ajax()���룬�ᷢ����������
            // ((x.event.special[o.origType] || {}).handle || o.handler).apply is not a function
        )
    })
</script>

</html>