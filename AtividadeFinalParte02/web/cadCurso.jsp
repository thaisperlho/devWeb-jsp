<%-- 
    Document   : cadCurso
    Created on : 1 de abr. de 2023, 15:46:39
    Author     : thaiscarvalho
--%>

<%-- 
    Document   : cadPaciente
    Created on : 28 de mar. de 2023, 11:36:19
    Author     : thaiscarvalho
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="UTF-8"%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>

<%
    Statement st = null;
    ResultSet rs = null;
%>

<!DOCTYPE html>
<html>
    <head>
    <meta charset=UTF-8>
    <%@ include file="estilos.jsp" %>
  <title>Cadastro Curso MVC</title>
    </head>
    <body class="d-flex h-100 text-center text-bg-dark">

        <div class="container text-left">
            <div class="row">
              <div class="col">
              </div>
              <div class="col">
                  <br>
        <form class="form-floating mb-3" action="CadCurso" method="post" id="cadastro">
            <legend>Cadastrar Curso</legend>
            <div class="mb-3">
                <label class="form-label" >Digite nome do curso</label>
                <input name="txtNome" type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
            </div>
            <div class="row g-1">
                <input class="btn btn-info" value="Cadastrar" type="submit" name="btnSalvar">
            </div>   
        </form>
              </div>
              <div class="col">
              </div>
            </div>
        </div>
    </body>
</html>




