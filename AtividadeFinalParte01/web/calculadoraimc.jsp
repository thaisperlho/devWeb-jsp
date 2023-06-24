<%-- 
    Document   : index
    Created on : 3 de jun. de 2023, 13:51:13
    Author     : thaiscarvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ include file="estilos.jsp" %>
        <title>JSP Page</title>
    </head>
    <body class="text-bg-dark">
        <%@ include file="menu.jsp" %>
        <div class="container text-center">
        <div class="row">
          <div class="col">
          </div>
          <div class="col">
              <h1>Calculadora Imc!</h1>
                <form action="Somar" method="post">
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Altura</label>
                        <input type="text" name="txtVal1" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Genero</label>
                        <select name="txtGenero" class="form-select" aria-label="Default select example">
                            <option disabled="" selected>Selecione uma opçao</option>
                            <option value="homem">Homem</option>
                            <option value="mulher">Mulher</option>
                        </select>
                    </div>
                    <button type="submit" name="btnCalc" class="btn btn-primary">Calcular</button>
                </form>
              
                <%  
                    String resultado = request.getParameter("resultado");
                %>
                <br>
                Resultado <%=resultado%>

          </div>
          <div class="col">
          </div>
        </div>
        </div>
               
        
    </body>
</html>
