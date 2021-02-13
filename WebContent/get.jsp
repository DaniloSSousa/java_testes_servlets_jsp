<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Empresas</title>
  </head>
  <body>
    <p>Lista de empresas:</p><br />
    <ul>
      <c:forEach items="${ companys }" var="company">
	    <li>
	      ${ company.name } - <fmt:formatDate
	        value="${ company.getOpenDate() }" pattern="dd/MM/yyyy" />
	    </li>
	  </c:forEach>
	</ul>
  </body>
</html>
