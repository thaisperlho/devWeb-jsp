/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.Dao;
import Model.ModelImc;
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
@WebServlet(name = "ControllImc", urlPatterns = {"/ControllImc","/Somar"})
public class ImcController extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getServletPath();
        if(action.equals("/Somar"))
        {
            Dao acao = new Dao();
            ModelImc modelo = new ModelImc();
            
            modelo.setH(Double.parseDouble(request.getParameter("txtVal1")));
            modelo.setG(request.getParameter("txtGenero"));
            double resultado = acao.CalculaValor(modelo);
            String result = String.format("%.2f", resultado);
            response.sendRedirect("calculadoraimc.jsp?resultado=" + result);
        }
        
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}