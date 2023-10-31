<!DOCTYPE html>
<html>
<head>
      <meta charset = "UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device=width, initial-scale=1.0">
      <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/style.css">
    <title>Página Inicial</title>
</head>
<body>
    <div class="container">
    <h1>Entre</h1>
    <form action="PagInicio" method="post">
        <input type="radio" name="tipoUsuario" value="participante" id="participante">
        <label for="participante">Participante</label><br>
        <input type="radio" name="tipoUsuario" value="organizador" id="organizador">
        <label for="organizador">Organizador</label><br>
        <input type="submit" value="Continuar">
    </form>
    </div>
</body>
</html>
