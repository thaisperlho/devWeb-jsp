/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.ModelCalculadora;
import Model.Dao;
import Model.ModelImc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thaiscarvalho
 */
@WebServlet(name = "CalculadoraController", urlPatterns = {"/CalculadoraController", "/conta"})
public class CalculadoraController extends HttpServlet {

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getServletPath();
        if(action.equals("/conta"))
        {
            Dao acao = new Dao();
            ModelCalculadora calc = new  ModelCalculadora();
            
            calc.setValor1(Double.valueOf(request.getParameter("txtVal1")));
            calc.setValor2(Double.valueOf(request.getParameter("txtVal2")));
            calc.setOperacao(request.getParameter("txtCon"));
            double resultado = acao.conta(calc);
            response.sendRedirect("calculadora.jsp?resultado=" + resultado);
        }
        
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
