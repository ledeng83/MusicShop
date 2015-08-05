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
        <h3>Here is the list of items</h3><br>

        <table border="1" style="width:70%">
            <tr>
                <th>Name</th>
                <th>Type</th>
                <th>Price</th>
                <th>Description</th>
                <th colspan="2">Actions</th>
            </tr>
            <c:forEach items="${itemList}" var="item">
                <tr>
                    <td><c:out value="${item.getName()}" /></td>
                    <td><c:out value="${item.getType()}" /></td>
                    <td><c:out value="${item.getPrice()}" /></td>
                    <td><c:out value="${item.getDesc()}" /></td>
                    <td><a href="RemoveItem?id=<c:out value="${item.getId()}"/>"/>Delete</a></td>
                    <td><a href="UpdateItem?id=<c:out value="${item.getId()}"/>"/>Update</a></td>
                </tr>
            </c:forEach>
        </table>

        <br><br>

        <a href="Home" >Back</a>

    </body>
</html>
