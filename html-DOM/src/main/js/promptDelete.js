/*
 * @Copyright: free for non-commercial usage
 * @Author: ahy231
 * @Date: 2020-10-30 14:34:09
 * @LastEditor: ahy231
 * @LastEditTime: 2020-10-30 16:44:50
 */

function deleteNode(tag) {

    var con = confirm("确定删除？");
    if (!con) {
        return;
    }

    var table = document.getElementsByTagName("table")[0];
    var td = tag.parentNode;
    var tr = td.parentNode;
    var index = tr.rowIndex;
    table.deleteRow(index);
}

function addNode(name) {
    
    function getTr(td1, td2) {
        var tr = document.createElement("tr");
        tr.appendChild(td1);
        tr.appendChild(td2);
        var foo = function () {
            return tr;
        }
        return foo;
    }

    function getTd1(name) {
        var td1 = document.createElement("td");
        td1.appendChild(document.createTextNode(name));
        var foo = function () {
            return td1;
        }
        return foo;
    }

    function getTd2() {
        var td2 = document.createElement("td");
        var a = document.createElement("a");
        var href = document.createAttribute("href");
        href.nodeValue = "#nowhere";
        var onclick = document.createAttribute("onclick");
        onclick.nodeValue = "deleteNode(this)";
        a.setAttributeNode(href);
        a.setAttributeNode(onclick);
        a.innerHTML = "删除";
        td2.appendChild(a);
        var foo = () => {
            return td2;
        }
        return foo;
    }

    var table = document.getElementsByTagName("table")[0];
    table.appendChild(getTr(getTd1(name)(), getTd2()())());
}