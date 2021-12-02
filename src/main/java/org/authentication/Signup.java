/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package org.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author USER
 */
public class Signup extends HttpServlet {

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
            out.println("<title>Servlet Signup</title>");            
            out.println("</head>");
            out.println("<body>");
             String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String role = request.getParameter("role");
             try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                try{
                Connection con;
                    con = DriverManager.getConnection( 
                            "jdbc:mysql://localhost:3306/vaccinetracker","root","wilber4c");
                    out.print("connected successfully");
                Statement stmt=con.createStatement();  
             //ResultSet rs=stmt.executeQuery("select * from counselor");
                //out.println("It worked though");
                stmt.executeUpdate("insert into users set username='"+username+"', email='"+email+"', role='"+role+"', password='"+password+"'");  
                out.print("inserted successfully");
//                while(rs.next()){
//                   out.println("<font color='red'>"+rs.getInt(1)+"</font> "+rs.getString(2)+"<br>");   
//                }  
                } catch(SQLException s){
                    out.println("The error is "+s.getMessage());
                }
            }
            catch(ClassNotFoundException e){
                out.println("The error is "+e.getMessage());
            }
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
        processRequest(request, response);
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
