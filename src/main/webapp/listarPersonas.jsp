<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:forEach  var="certificado" items="${personas}" varStatus="status">
            <ul>
                <li>${certificado.uuid_empresa}</li>
                <li>${certificado.razon_social_empresa}</li>
                <li>${certificado.ruc_empresa}</li>
            </ul>
        </c:forEach>
    </body>
</html>
