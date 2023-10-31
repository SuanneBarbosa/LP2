<%@ taglib tagdir="/WEB-INF/tags" prefix="ig"%>

<!DOCTYPE html>
<html lang = "pt-br">
    <head>
    <meta charset = "UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device=width, initial-scale=1.0">
        <title>Cadastro</title>
         <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/style.css">
    </head>
    <body>
    <h2>Cadastro de Clientes</h2>
       <form action="exemplo1" method="post">
     <label for="nome">Nome:</label>
            <input type="text" name="nome" required><br><br>

            <label for="cpf">CPF:</label>
            <input type="text" name="cpf" required><br><br>

            <label for="telefone">Telefone:</label>
            <input type="text" name="telefone"><br><br>

            <label for="dataNascimento">Data de Nascimento:</label>
            <input type="date" name="dataNascimento" required><br><br>

            <input type="submit" value="Cadastrar">
        </form>

         <h2>Encontre Clientes</h2>

                <a href="/aba1ListaCliente.jsp"> Lista de Clientes Cadastrados</a></li>

                <form action="busca-cliente" method="get">
                    <label for="cpfBusca">Buscar Cliente por CPF:</label>
                        <input type="text" name="cpf" required>
                        <input type="submit" value="Buscar">
                </form>


     </body>
</html>







