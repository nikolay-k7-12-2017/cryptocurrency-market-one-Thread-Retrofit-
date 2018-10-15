<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kolja
  Date: 19.02.2018
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Price</title>
</head>
<body>
<p1 align="center">
    <h3>Currency quotes</h3>
    ${data1}

    <table border="1">

        <caption>Report</caption>

        <tr>
            <td><p> price:quantity:summa [${valuta}]:</p> </td>
            <td><p>price:quantity:summa [${valuta2}]: </p></td>
            <td><p>price:quantity:summa [${valuta3}]:</p></td>
            <td><p>price:quantity:summa [${valuta4}]:</p></td>
            <td><p>price:quantity:summa [${valuta5}]:</p></td>

        </tr>


<%--
          ${cont2}
        ${data1}
        <%= request.getAttribute("data1")%>--%>

        <tr>
            <td>
        <c:forEach items="${requestScope.cont}" var="contract" >

                 <p> ${birga} - </p> <c:out value="${ contract.get(0)}"> </c:out> :
                    <c:out value="${ contract.get(1)}"> </c:out> :
                    <c:out value="${ contract.get(2)}"> </c:out>

        </c:forEach>
            </td>
            <td>
                <c:forEach items="${requestScope.cont2}" var="contract" >
                    <p> ${birga} - </p> <c:out value="${ contract.get(0)}"> </c:out> :
                    <c:out value="${ contract.get(1)}"> </c:out> :
                    <c:out value="${ contract.get(2)}"> </c:out>
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${requestScope.cont3}" var="contract" >
                    <p> ${birga} - </p> <c:out value="${ contract.get(0)}"> </c:out> :
                    <c:out value="${ contract.get(1)}"> </c:out> :
                    <c:out value="${ contract.get(2)}"> </c:out>
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${requestScope.cont4}" var="contract" >
                    <p> ${birga} - </p> <c:out value="${ contract.get(0)}"> </c:out> :
                    <c:out value="${ contract.get(1)}"> </c:out> :
                    <c:out value="${ contract.get(2)}"> </c:out>
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${requestScope.cont5}" var="contract" >
                    <p> ${birga} - </p> <c:out value="${ contract.get(0)}"> </c:out> :
                    <c:out value="${ contract.get(1)}"> </c:out> :
                    <c:out value="${ contract.get(2)}"> </c:out>
                </c:forEach>
            </td>
        </tr>
        <tr>

        </tr>

    </table>


</p1>
</body>
</html>
