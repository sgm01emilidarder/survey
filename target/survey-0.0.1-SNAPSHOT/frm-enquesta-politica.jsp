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
			<h1 class="col-12 display-4">Enquesta eleccions generals</h1>
		</header>
		
		<main class="row border">
			<form class="col-12" name="frm-enquesta" action="controller-enquesta" method="post">
				<input type="hidden" name="codi-empresa" value="1" />
				<input type="hidden" name="tipus-enquesta" value="enq-politica" />	
				
				<fieldset class="col-12 form-group">
					
					<%@include file="common/camps-dades-personals.jsp" %>
					
					<hr/>
					
					<label>Quin partit polític creus que guanyarà a les próximes eleccions?</label>
					<select id="pregunta-1" name="pregunta-1" class="form-control col-6">
						<option value="psoe">PSOE</option>
						<option value="pp">PP</option>
						<option value="podemos">Podemos</option>
						<option value="vox">Vox</option>				
					</select>
  					
  					<label>Quin partit t'agradaria que guanyàs?</label>
  					<select id="pregunta-2" name="pregunta-2"  class="form-control col-6">
						<option value="psoe">PSOE</option>
						<option value="pp">PP</option>
						<option value="podemos">Podemos</option>
						<option value="vox">Vox</option>				
					</select>
  					
  					
					<label>Quina és la teva opinió sobre la situació política actual?</label>
					<p><textarea class="form-control col-6" id="pregunta-observacions" name="observacions" rows="4" cols="50"></textarea></p>
						
					<button class="btn btn-primary" type="submit">Enviar dades</button>
				
				</fieldset>				
			</form>
		
		</main>
	
	</div>

</body>
</html>