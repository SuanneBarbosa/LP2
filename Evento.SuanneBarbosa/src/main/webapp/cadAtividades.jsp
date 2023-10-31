
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset = "UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device=width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/style.css">

    <title>Cadastro de Atividade</title>
</head>
<body>
    <div class="container">
    <h1>Cadastro de Atividade</h1>

    <form action="CadAtividade" method="post">
        Tipo: <input type="text" name="tipo"><br>
        Data: <input type="text" name="data"><br>
        Endereço: <input type="text" name="endereco"><br>
        Nome do Organizador: <input type="text" name="nomeOrganizador"><br>
        <input type="submit" value="Cadastrar">
    </form>
    </div>
</body>
</html>








