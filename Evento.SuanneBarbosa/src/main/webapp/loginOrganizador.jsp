<!DOCTYPE html>
<html>
<head>
    <meta charset = "UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device=width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/style.css">
    <title>Login do Organizador</title>
</head>
<body>
    <div class="container">
    <h1>Login do Organizador</h1>
    <form action="LogOrganizador" method="post">
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required><br>
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha" required><br>
        <input type="submit" value="Login">
    </form>
    </div>
</body>
</html>
