<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.pixelbit.survey.pojo.Enquesta" %>
<%-- 
 	Llista totes que s'han donat d'alta al sistema
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

		
        <c:forEach var="enquesta" varStatus="loop" items="${llistaEnquestes}">
			<c:forEach var="pregunta" varStatus="loop" items="${enquesta.preguntes}">
				<li> <c:out value="${pregunta.descripcio}"/> <c:out value="${pregunta.resposta}"/></li>            
			</c:forEach>	                   
        </c:forEach>
        
</body>
</html>