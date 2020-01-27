package java;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {


    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i=Integer.parseInt(request.getParameter("num1"));
        int j= Integer.parseInt(request.getParameter("num2"));
        int k= i+j;
        //System.out.println("result is"+ k);
        PrintWriter pw= response.getWriter();
        pw.println("result is"+k);
        //session management

        request.setAttribute("k", k);
        int s=(int)request.getAttribute("k");
        RequestDispatcher rd= request.getRequestDispatcher("sq");
        rd.forward(request,response);

    }
}
