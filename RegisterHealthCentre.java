/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.health;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */


import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.sql.*;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author USER
 */
public class RegisterHealthCentre extends SimpleTagSupport {

    private String n, a, c;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/vaccinetracker","root","");
            PreparedStatement ps = con.prepareStatement("Insert into healthcentres "
                    + "(healthcentrename,address,contact) values(?,?,?)");
            ps.setString(1, getN());
            ps.setString(2, getA());
             ps.setString(3, getC());
            int res = ps.executeUpdate();

            if (res == 1) {
                out.print("<script>alert('Health Centre Registered successfully')</script>");
                out.print("<script>window.location.href='healthcentres'</script>");
            } else {
                out.print("<script>alert('Not registered, try again')</script>");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    } 

    /**
     * @return the n
     */
    public String getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(String n) {
        this.n = n;
    }

    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the c
     */
    public String getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(String c) {
        this.c = c;
    }
}
