/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.Dao;
import Model.ModelImc;
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
@WebServlet(name = "AreaTrapezioController", urlPatterns = {"/AreaTrapezioController","/trapezio"})
public class AreaTrapezioController extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getServletPath();
       
        if(action.equals("/trapezio"))
        {
            Dao acao = new Dao();
            ModelTrapezio trapezio = new  ModelTrapezio();
            
            trapezio.setbMaior(Double.valueOf(request.getParameter("txtVal1")));
            trapezio.setbMenor(Double.valueOf(request.getParameter("txtVal2")));
            trapezio.setA(Double.valueOf(request.getParameter("txtAlt")));
            
            double resul = acao.calcTrapezio(trapezio);
            response.sendRedirect("areaTrapezio.jsp?resultado=" + resul);
        }
        
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}