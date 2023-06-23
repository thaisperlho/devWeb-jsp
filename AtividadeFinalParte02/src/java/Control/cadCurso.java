/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Control;

import Model.Dao;
import Model.CursoModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec 3D
 */
@WebServlet(name = "cadCurso", urlPatterns = {"/CadCurso"})
public class cadCurso extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getServletPath();
        if (action.equals("/CadCurso")) {

            Statement st = null;
            ResultSet rs = null;

            try {
                String nomeCurso = request.getParameter("txtNome");
                CursoModel curso = new CursoModel();
                curso.setNomeCurso(nomeCurso);
                st = new Dao().conectar().createStatement();

                st.executeUpdate("insert into tbcurso(nomeCurso) values ('" + curso.getNomeCurso()+ "')");
                response.sendRedirect("index.jsp?resultado=Cadastrado");
            } catch (SQLException e) {
                response.sendRedirect("index.jsp?resultado=Não cadastrado" + e);
            }
        }
    }
    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
