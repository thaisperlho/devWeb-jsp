/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.Dao;
import Model.ModelImc;
import Model.ModelRetangulo;
import Model.ModelTrapezio;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thaiscarvalho
 */
@WebServlet(name = "VolumeRetanguloController", urlPatterns = {"/VolumeRetanguloController","/volume"})
public class VolumeRetanguloController extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getServletPath();
       
        if(action.equals("/volume"))
        {
            Dao acao = new Dao();
            ModelRetangulo retangulo = new  ModelRetangulo();
            
            retangulo.setComprimento(Double.valueOf(request.getParameter("txtVal1")));
            retangulo.setLargura(Double.valueOf(request.getParameter("txtVal2")));
            retangulo.setAltura(Double.valueOf(request.getParameter("txtAlt")));
            
            double resul = acao.calcRetangulo(retangulo);
            response.sendRedirect("volumeRetangulo.jsp?resulRetangulo=" + resul);
        }
        
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}