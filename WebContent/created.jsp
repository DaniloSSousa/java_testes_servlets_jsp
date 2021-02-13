<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Nova empresa</title>
  </head>
  <body>
    <c:if test="${ not empty name }">
      <p>Nova empresa criada: ${ name }.</p>
    </c:if>
    <c:if test="${ empty name }">
      <p>Nenhuma empresa criada.</p>
    </c:if>
  </body>
</html>
