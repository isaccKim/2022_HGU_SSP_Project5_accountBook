<%--
  Created by IntelliJ IDEA.
  User: isacc_kim
  Date: 2022/12/02
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<form action="addok" method="post">
    <table id="edit">
        <tr><td>카드</td><td><input type="text" name= "card"/></td></tr>
        <tr><td>내용</td><td><input type="text" name= "content"/></td></tr>
        <tr><td>가격</td><td><input type="text" name= "price"/></td></tr>
        <tr><td>할부방법</td><td><input type="text" name= "installment"/></td></tr>
    </table>
    <button type="button" onclick="location.href=list">목록보기</button>
    <button type="submit">등록하기</button>
</form>
<body>

</body>
</html>
