<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Enquesta</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
        input, label {
            display: block;
        }

        label {
            padding-top: 15px;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container">
    <header class="row mb-5">
        <h1 class="col-12 display-4">Enquesta Formacions</h1>
        <h2 class="col-12 text-muted">Informàtica. Lenguatges de programació</h2>
    </header>
    <main class="row border">
        <form class="col-12" name="frm-enquesta" action="controller-enquesta" method="post">
            <input type="hidden" name="codi-empresa" value="1"/>
            <input type="hidden" name="tipus-enquesta" value="enq-formacio"/>

            <fieldset class="col-12 form-group">
                <%@include file="common/camps-dades-personals.jsp" %>

                <hr/>

                <label>Quin seria el lloc de feina o àrea en el que t'agradaria especialitzar-te?</label>
                <select id="pregunta-1" name="pregunta-1" class="form-control col-6">
                    <option value="sys-pure">PureSystem</option>
                    <option value="dev-ops">Devops</option>
                    <option value="dev-frontend">Developer Front-End</option>
                    <option value="dev-backend">Developer Back-End</option>
                    <option value="seg-perimetral">Tècnic de Seguridad Perimetral (Fortinet/PaloAlto/Bluecoat)</option>
                    <option value="seg-ciberseguretat">Ciberseguretat</option>
                    <option value="arq-big-data">Arquitecte Big Data</option>
                </select>

                <label>Quin curs t'agradaria realitzar per millorar la teva formació?</label>
                <select id="pregunta-2" name="pregunta-2" class="form-control col-6">
                    <option value="angular">Desenvolupament web Angular</option>
                    <option value="react">React JS Hooks</option>
                    <option value="spring">Spring Security</option>
                </select>

                <label>Quins lleguantes de programació t'agradaria aprendre?</label>
                <div class="form-check form-check-inline">
                    <input class="form-check-input d-inline-block ml-3" type="checkbox" name="lag-programing" value="php"/> PHP
                    <input class="form-check-input d-inline-block ml-3" type="checkbox" name="lag-programing" value="java"/> Java
                    <input class="form-check-input d-inline-block ml-3" type="checkbox" name="lag-programing" value="python"/> Python
                </div>
				<br>
                <button class="btn btn-primary mt-2" type="submit">Enviar dades</button>

            </fieldset>
        </form>
    </main>

</div>

</body>
</html>