<%--
    Document   : listItems
    Created on : Aug 4, 2015, 3:02:03 PM
    Author     : ldeng
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item List</title>
    </head>
    <body>
        <h3>Here is the list of instrument</h3><br>

        <table>
            <tr>
                <th>Item Name</th>
                <th>Description</th>
            </tr>
            <c:forEach items="${itemList}" var="item">
                <tr>
                    <td><c:out value="${item.getName()}" /></td>
                    <td><c:out value="${item.getDesc()}" /></td>
                    <td><a href="RemoveItem?id=<c:out value="${item.getId()}"/>"/>Delete</a></td>
                     <td><a href="RemoveItem?id=<c:out value="${item.getId()}"/>"/>Update</a></td>
                </tr>
            </c:forEach>
        </table>

        <br><br>

        <a href="Home" >Back</a>

    </body>
</html>
