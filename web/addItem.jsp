<%--
    Document   : updateItem
    Created on : Aug 5, 2015, 11:13:29 AM
    Author     : ldeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update an Item</title>
    </head>
    <body>
        <h3>Add an item</h3><br>
        <form action="AddItem" method="POST">
            <label for="name">Name: </label>
            <input type="text" name="name" id="name"><br>
            <label for="type">Type: </label>
            <input type="radio" name="type" id="instrument" value="Instrument">Instrument
            <input type="radio" name="type" id="record" value="Record">Record<br>
            <label for="price">Price: </label>
            <input type="number" step="0.01" name="price" id="price"><br>
            <label for="desc">Description: </label><br>
            <textarea name="desc" cols="40" rows="5" placeholder="Enter your description here..."></textarea><br><br>
            <input type="submit" name="submit" value="Submit">
        </form> <br>
        <form action="Home" method="GET">
            <input type="submit" name="cancel" value="Cancel">
        </form>
    </body>
</html>
