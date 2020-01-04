<%--
  Created by IntelliJ IDEA.
  User: Sergio
  Date: 04/01/2020
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Enquesta</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
        input, label{ display:block;}
        label{
            padding-top:15px;
            font-weight:bold;
        }
    </style>
</head>
<body>

<div class="container">
    <header class="row mb-5">
        <h1 class="col-12 display-4">Enquesta regals nadal</h1>
    </header>

    <main class="row border">
        <form class="col-12" name="frm-enquesta" action="controller-enquesta" method="post">
            <input type="hidden" name="codi-empresa" value="1" />
            <input type="hidden" name="tipus-enquesta" value="enq-regals" />

            <fieldset class="col-12 form-group">

                <%@include file="common/camps-dades-personals.jsp" %>

                <hr/>

                <label>Quina consola compraria?</label>
                <select id="pregunta-1" name="pregunta-1" class="form-control col-6">
                    <option value="ps4">ps4</option>
                    <option value="xbox one">xbox one</option>
                    <option value="switch">switch</option>
                </select>

                <label>Quin videojoc compraria?</label>
                <select id="pregunta-2" name="pregunta-2"  class="form-control col-6">
                    <option value="sekiro">sekiro</option>
                    <option value="dark souls">dark souls</option>
                    <option value="pokemon">pokemon</option>
                    <option value="altre">altre</option>
                </select>


                <label>En cas d'haver escollit altre, quin videojoc compraria?</label>
                <p><textarea class="form-control col-6" id="pregunta-observacions" name="observacions" rows="4" cols="50"></textarea></p>

                <button class="btn btn-primary" type="submit">Enviar dades</button>

            </fieldset>
        </form>

    </main>

</div>

</body>
</html>
