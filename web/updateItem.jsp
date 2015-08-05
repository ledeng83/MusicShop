<%--
    Document   : addInstrument
    Created on : Aug 4, 2015, 11:13:29 AM
    Author     : ldeng
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add An Item</title>
    </head>
    <body>
        <h3>Fill Information to Add an Item</h3><br>
        <form action="UpdateItem" method="POST">
            <input type="hidden" name="id" id="id" value="${item.getId()}">
            <label for="name">Name: </label>
            <input type="text" name="name" id="name" value="${item.getName()}"><br>
            <label for="type">Type: </label>
            <input type="radio" name="type" id="instrument" value="Instrument" <c:if test="${item.getType() == 'Instrument'}">checked</c:if>>Instrument
            <input type="radio" name="type" id="record" value="Record" <c:if test="${item.getType() == 'Record'}">checked</c:if>>Record<br>
                <label for="price">Price: </label>
                <input type="number" step="0.01" name="price" id="price" value="${item.getPrice()}"><br>
            <label for="desc">Description: </label><br>
            <textarea name="desc" cols="40" rows="5">${item.getDesc()}</textarea><br><br>
            <input type="submit" name="submit" value="Submit">
        </form><br>
        <form action="ListItem" method="GET">
            <input type="submit" name="cancel" value="Cancel">
        </form>

    </body>
</html>
