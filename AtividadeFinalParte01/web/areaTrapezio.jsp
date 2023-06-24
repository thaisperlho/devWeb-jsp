<%-- 
    Document   : calculadora
    Created on : 17 de jun. de 2023, 14:12:21
    Author     : thaiscarvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="Somar" method="post">
            <label>Valor 1</label>
            <input type="number" name="txtVal1"><br>
            <label>Valor 2</label>
            <input type="number" name="txtVal2"><br>
            <label for="cars">Escolha a Operação</label>
            <select name="cars" id="cars">
              <option value="+">Somar</option>
              <option value="-">Subtrair</option>
              <option value="/">Dividir</option>
              <option value="*">Multiplicar</option>
            </select><br>
            <input type="submit" name="tbnCalc" value="Calcular">
            
        </form>

    </body>
</html>
