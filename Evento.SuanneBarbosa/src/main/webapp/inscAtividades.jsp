<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset = "UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device=width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/style.css">
    <title>Inscrição em Atividades</title>
</head>
<body>

    <div class="container">
    <h2>Lista de Atividades</h2>
    <ul>
        <c:forEach items="${atividades}" var="atividade">
            <li>
                Tipo: ${atividade2.tipo}<br>
                Data: ${atividade2.data}<br>
                Endereço: ${atividade2.endereco}<br>
            </li>
        </c:forEach>
    </ul>

     <h1>Inscreva-se</h1>
        <form action="InscricaoAtividade" method="post">
            <label for="idAtividade">ID da Atividade:</label>
            <input type="text" id="idAtividade" name="idAtividade" required>
            <label for="nomeParticipante">Nome do Participante:</label>
            <input type="text" id="nomeParticipante" name="nomeParticipante" required>
            <button type="submit">Inscrever-se</button>
        </form>
     </div>
</body>
</html>

