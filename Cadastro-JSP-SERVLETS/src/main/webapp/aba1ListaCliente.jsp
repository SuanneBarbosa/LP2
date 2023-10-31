<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
    <meta charset = "UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device=width, initial-scale=1.0">
        <title>Lista de Clientes</title>
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/styleLista.css">
    </head>
    <body>
    	<h1>Lista de Clientes</h1>

            <table border="1">
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>Telefone</th>
                    <th>Data de Nascimento</th>
                </tr>
                <c:forEach items="${clientes}" var="cliente">
                    <tr>
                        <td>${cliente.nome}</td>
                        <td>${cliente.cpf}</td>
                        <td>${cliente.telefone}</td>
                        <td>${cliente.dataNascimento}</td>
                    </tr>
                </c:forEach>
            </table>
      </body>

</html>