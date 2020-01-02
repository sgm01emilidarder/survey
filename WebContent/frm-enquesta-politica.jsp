<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Enquesta</title>
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
		<header>
			<h1>Enquesta eleccions generals</h1>
		</header>
		
		<main>
			<form name="frm-enquesta" action="controller-enquesta" method="post">
				<input type="hidden" name="codi-empresa" value="1" />
				<input type="hidden" name="tipus-enquesta" value="enq-politica" />	
				
				<fieldset>
					<legend>Enquesta</legend>
					
					<%@include file="common/camps-dades-personals.jsp" %>
					
					<hr/>
					
					<label>Quin partit polític creus que guanyarà a les próximes eleccions?</label>
					<select id="pregunta-1" name="pregunta-1">
						<option value="psoe">PSOE</option>
						<option value="pp">PP</option>
						<option value="podemos">Podemos</option>
						<option value="vox">Vox</option>				
					</select>
  					
  					<label>Quin partit t'agradaria que guanyàs?</label>
  					<select id="pregunta-2" name="pregunta-2">
						<option value="psoe">PSOE</option>
						<option value="pp">PP</option>
						<option value="podemos">Podemos</option>
						<option value="vox">Vox</option>				
					</select>
  					
  					
					<label>Quina és la teva opinió sobre la situació política actual?</label>
					<p><textarea id="pregunta-observacions" name="observacions" rows="4" cols="50"></textarea></p>
						
					<button type="submit">Enviar dades</button>				
				
				</fieldset>				
			</form>
		
		</main>
	
	</div>

</body>
</html>