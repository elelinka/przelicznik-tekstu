<%--
  Created by IntelliJ IDEA.
  User: grego
  Date: 10.09.2019
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Przelicznik</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
          integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
          crossorigin="anonymous"></script>
  <style>
    .header {
      display: flex;
      justify-content: center;
    }
    .text-form {
      display: flex;
      flex-direction: column;
      margin: 30px;
    }
  </style>
</head>
<body>
<div class="header">
  <h2>Przelicznik tekstu</h2>
</div>
<div class="text-form">
  <form action="/text" method="post">
    <div class="form-group">
      <textarea class="form-control" rows="10" name="content"></textarea>
    </div>
    <button type="submit" class="btn btn-outline-primary">Wyślij</button>
  </form>
</div>
</body>
</html>