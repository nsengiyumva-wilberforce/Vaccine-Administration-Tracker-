/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.taghandlers;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.sql.*;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author USER
 */
public class RegisterUserHandler extends SimpleTagSupport {

    private String u, p, e, r, f, l, h;

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
                    "jdbc:mysql://localhost:3306/vaccinetracker", "root", "wilber4c");
            PreparedStatement ps = con.prepareStatement("Insert into newusers values(?,?,?,?,?,?,?)");
            ps.setString(1, getU());
            ps.setString(2, getF());
            ps.setString(3, getL());
            ps.setString(4, getP());
            ps.setString(5, getH());
            ps.setString(6, getE());
            ps.setString(7, getR());
            int res = ps.executeUpdate();

            if (res == 1) {
                out.print("<script>alert('User Registered successfully')</script>");
                out.print("<script>window.location.href='systemsadministration'</script>");
            } else {
                out.print("<script>alert('Not Inserted, try again')</script>");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * @return the u
     */
    public String getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(String u) {
        this.u = u;
    }

    /**
     * @return the p
     */
    public String getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(String p) {
        this.p = p;
    }

    /**
     * @return the e
     */
    public String getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(String e) {
        this.e = e;
    }

    /**
     * @return the r
     */
    public String getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(String r) {
        this.r = r;
    }

    /**
     * @return the f
     */
    public String getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(String f) {
        this.f = f;
    }

    /**
     * @return the l
     */
    public String getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(String l) {
        this.l = l;
    }

    /**
     * @return the h
     */
    public String getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(String h) {
        this.h = h;
    }

    
}
