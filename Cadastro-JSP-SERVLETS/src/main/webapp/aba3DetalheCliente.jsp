<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset = "UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device=width, initial-scale=1.0">
        <title>Cliente</title>
         <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/styleDetalheCliente.css">
    </head>
    <body>
    <h1>Detalhes do Cliente</h1>

        <c:if test="${cliente != null}">
            <h2>Nome: ${cliente.nome}</h2>
            <p>CPF: ${cliente.cpf}</p>
            <p>Telefone: ${cliente.telefone}</p>
            <p>Data de Nascimento: ${cliente.dataNascimento}</p>
        </c:if>

        <c:if test="${cliente == null}">
            <p>Cliente não encontrado.</p>
        </c:if>

      </body>

</html>