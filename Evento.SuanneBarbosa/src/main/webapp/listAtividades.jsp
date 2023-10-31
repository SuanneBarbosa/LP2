<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset = "UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device=width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/style.css">
    <title>Lista de Atividades</title>
</head>
<body>
    <div class="container">
    <h1>Lista de Atividades</h1>
    <ul>
        <c:forEach items="${atividades}" var="atividade">
            <li>
                Tipo: ${atividade.tipo}<br>
                Data: ${atividade.data}<br>
                Endereço: ${atividade.endereco}<br>
                Organizador: ${atividade.nomeOrganizador}<br>
                Identificador da Atividade: ${atividade.id}
            </li>
        </c:forEach>
    </ul>
    </div>
</body>
</html>

