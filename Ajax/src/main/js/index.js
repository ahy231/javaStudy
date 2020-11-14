/*
 * @Author: ahy231
 * @Date: 2020-11-14 09:30:40
 * @LastEditors: ahy231
 * @LastEditTime: 2020-11-14 10:01:53
 */
function loadXMLDoc() {
    var xmlhttp;
    if (window.XMLHttpRequest) {
        // 新版浏览器
        xmlhttp = new XMLHttpRequest();
    } else {
        // 旧版浏览器
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("GET", "../webapp/test.jsp?", true);
    xmlhttp.send();
}