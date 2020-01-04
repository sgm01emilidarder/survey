<%--
  Created by IntelliJ IDEA.
  User: Sergio
  Date: 04/01/2020
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.pixelbit.survey.pojo.EnquestaRegals" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body class="container">

<h1 class="display-4">Enquesta enviada <img src="https://pngimage.net/wp-content/uploads/2018/05/correcto-incorrecto-png-6.png" alt="" style="height: 3vw ; width: 3vw"/></h1>

<hr/>

<header>
    <h1 class="ml-3">Dades de l'enquesta <img src="https://image.flaticon.com/icons/png/512/30/30412.png" alt="" style="width: 2vw ; height: 2vw"></h1>
    <h2 class="ml-4">${tipusEnquesta} <img src="https://images.vexels.com/media/users/3/134727/isolated/preview/f088d13b2e249236f2cbc7cd5b6e6f4a-caja-de-regalo-roja-icono-azul-arco-1-by-vexels.png" alt="" style="width: 2vw ; height: 2vw"></h2>
</header>
<div class="ml-3 border">
    <section>
        <h3 class="ml-3">Dades personals <img src="https://image.flaticon.com/icons/png/512/33/33750.png" alt="" style="width: 1.2vw ; height: 1.2vw"></h3>
        <p class="ml-5">Tractament: <c:out value="${enquesta.entrevistat.tractament}"/></p>
        <p class="ml-5">DNI: <c:out value="${enquesta.entrevistat.dni}"/></p>
        <p class="ml-5">Nom: <c:out value="${enquesta.entrevistat.nom}"/></p>
        <p class="ml-5">Llinatges: <c:out value="${enquesta.entrevistat.llinatges}"/></p>
        <p class="ml-5">Email: <c:out value="${enquesta.entrevistat.email}"/></p>
        <p class="ml-5">telefon: <c:out value="${enquesta.entrevistat.telefon}"/></p>
    </section>

    <section class="ml-3">
        <h3>Preguntes <img src="https://image.flaticon.com/icons/png/512/1294/1294451.png" alt="" style="width: 1.2vw ; height: 1.2vw"></h3>
        <ul>
            <c:forEach var="pregunta" varStatus="loop" items="${enquesta.preguntes}">
                <li> <c:out value="${pregunta.descripcio}"/> <c:out value="${pregunta.resposta}"/></li>
            </c:forEach>
        </ul>
    </section>

    <section class="ml-3">
        <h3>Joc alternatiu <img src="https://www.urjc.es/images/facultades/etsii/logosgrados/5.videojuegos.png" alt="" style="width: 2vw ; height: 2vw"></h3>
        <c:out value="${enquesta.observacions}"/>
    </section>
</div>

</body>
</html>
