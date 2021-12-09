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
public class UpdateHealthCentre extends SimpleTagSupport {
    private String h;
    private String c;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try{   
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con;
                    con = DriverManager.getConnection( 
                            "jdbc:mysql://localhost:3306/vaccinetracker","root",""); 
        PreparedStatement ps = con.prepareStatement("update healthcentres set ID=?, healthcentrename=? where centre_id=?");
		ps.setInt(1, Integer.parseInt(getC()));
		ps.setString(2, getH());
		ps.setInt(3, Integer.parseInt(getC()));
		int res = ps.executeUpdate();
        if(res==1){ 
            out.print("<script>alert('Health Centre updated successfully')</script>");
            out.print("<script>window.location.href='healthcentres'</script>");
        } else {
            out.print("<script>alert('Not updated, try again')</script>");
        }
        con.close();  
    }catch(Exception e){System.out.println(e);} 
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
