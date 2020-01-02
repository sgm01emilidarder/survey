<%@page contentType="text/html" pageEncoding="UTF-8"%>
    
<%-- Camps de les dades personals d'un entrivistat--%>  
  
<h3 class="row">Dades personals</h3>
<label>Tractament:</label>
<div class="form-check form-check-inline mx-3">
    <input class="form-check-input" type="radio" name="tractament" value="Senyor" checked>Senyor
    <input class="form-check-input ml-3" type="radio" name="tractament" value="Senyora">Senyora
</div>
<div class="form-row">
    <div class="form-group col-md-4">
        <label for="dni">DNI:</label>
        <input type="text" name="dni" class="form-control" id="dni" value="">
    </div>
    <div class="form-group col-md-4">
        <label for="nom">Nom:</label>
        <input type="text" name="nom" class="form-control" id="nom" value="">
    </div>
    <div class="form-group col-md-4">
        <label for="llinatges">Llinatges:</label>
        <input type="text" name="llinatges" class="form-control" id="llinatges" value="">
    </div>
</div>

<div class="form-row">
    <div class="form-group col-md-6">
        <label for="email">Correu:</label>
        <input type="email" name="email" class="form-control" id="email" value="">
    </div>
    <div class="form-group col-md-6">
        <label for="email">Telefon:</label>
        <input type="telefon" name="telefon" class="form-control" id="telefon" value="">
    </div>
</div>
