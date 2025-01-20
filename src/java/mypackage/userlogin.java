/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mypackage;


import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.DriverManager;

/**
 *
 * @author yoges
 */
@WebServlet(name = "userlogin", urlPatterns = {"/userlogin"})
public class userlogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet userlogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter pw=response.getWriter();
           try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
     
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/online_book", "root", "1234");
        PreparedStatement pt=con.prepareStatement("select*from user where Gmail=? and Password=?");
        String uname=request.getParameter("email");
        String pass=request.getParameter("pw");
        pt.setString(1, uname);
        pt.setString(2, pass);
        
        ResultSet rs=pt.executeQuery();
        //String na = rs.getString("Name");
        //out.print(na);
        if (rs.isBeforeFirst())
        {
     // session.setAttribute("user", na);
//       session.setAttribute("USER", uname);
      //  out.print("yes user "+uname);
        RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
        rd.forward(request, response);
        }
        else{
         RequestDispatcher rd=request.getRequestDispatcher("index.html");
        rd.include(request, response);
          
        }
        }
        catch (Exception e)
        {
        pw.print(e.getMessage());
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
