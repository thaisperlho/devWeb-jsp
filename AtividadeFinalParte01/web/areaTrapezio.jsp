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
              <br><br>
              <h1>Calculadora</h1>
              <form action="trapezio" method="post">
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Base maior</label>
                        <input type="number" name="txtVal1" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Base menor</label>
                        <input type="number" name="txtVal2" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label for="exampleFormControlInput1" class="form-label">Altura</label>
                        <input type="number" name="txtAlt" class="form-control">
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
