<%--
    Document   : updateItemSuccessful
    Created on : Aug 5, 2015, 9:34:26 AM
    Author     : ldeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Successful</title>
    </head>
    <body>
        <h3>The item is updated successfully.</h3>
        <p>Here is the updated item info:</p>
        <p>
            Name: ${item.getName()}<br>
            Type: ${item.getType()}<br>
            Price: ${item.getPrice()}<br>
            Description: ${item.getDesc()}<br>
        </p>
        <a href="ListItem">Back</a>

    </body>
</html>

