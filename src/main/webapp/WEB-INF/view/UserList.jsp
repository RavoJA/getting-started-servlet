<%@ page import="jar.dev.servlet.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jardev
  Date: 12/8/23
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% List<User> users = (List<User>) request.getAttribute("users"); %>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>List des utilisateurs</h1>
<table>

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
        <th>Sexe</th>
        <th colspan="2">Action</th>
    </tr>

    <% for (int i = 0; i < users.size(); i++) { %>
        <tr>
            <td><%= users.get(i).getName()%></td>
            <td><%= users.get(i).getAddress()%></td>
            <td><%= users.get(i).getSexe()%></td>
            <td><a href="user-by-id?id=<%= users.get(i).getId()%>">Modifier</a></td>
            <td><a href="delet-user-by-id?id=<%= users.get(i).getId()%>">Modifier</a></td>

        </tr>
    <% } %>

</table>
</body>
</html>
