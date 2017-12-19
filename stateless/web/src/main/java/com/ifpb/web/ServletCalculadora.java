
package com.ifpb.web;

import com.ifpb.shared.Calculadora;
import com.ifpb.shared.ServiceLocator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletCalculadora", urlPatterns = {"/calculadora"})
public class ServletCalculadora extends HttpServlet {
    
    private Calculadora calculadora
            = new ServiceLocator()
                    .lookup("host-core", "3700", "java:global/core/CalculadoraPadrao");
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        
        int resultado = calculadora.somar(n1, n2);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCalculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado: " + resultado + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
