<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <p>Welcome to dos ${name}</p>
    <!-- <p>${todo}</p> -->
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th>Desciprtion</th>
          <th>Target Date</th>
          <th>Is Done</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todo}" var="todo">
          <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.localDate}</td>
            <td>${todo.done}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
