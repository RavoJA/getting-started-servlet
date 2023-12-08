<%@ page import="jar.dev.servlet.model.User" %><%--
  Created by IntelliJ IDEA.
  User: jardev
  Date: 12/8/23
  Time: 12:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% User user = (User) request.getAttribute("user"); %>

<html>
<head>
    <title>Title</title>
</head>
<body>
  <div>
      <form action="save-user" method="post">

          <div>
              <label for="id">Name</label>
              <input id="id" name="id" value="<%= user.getId()%>" type="text">
          </div>

          <div>
              <label for="name">Name</label>
              <input id="name" name="name" value="<%= user.getName()%>" type="text">
          </div>

          <div>
              <label for="address">Address</label>
              <input id="address" name="address" type="text" value="<%= user.getAddress()%>" >
          </div>

          <div>
              <label for="sexe">Sexe</label>
              <select name="sexe" id="sexe" >
                  <option value="H" >H</option>
                  <option value="F">F</option>
                  <option value="ND">Undefined</option>
              </select>
          </div>

          <div>
              <button>Valider</button>
          </div>
      </form>
  </div>
</body>
</html>
