/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.vaccine;
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
public class RegisterVaccineHandler extends SimpleTagSupport {

    private String v, a;

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
                    "jdbc:mysql://localhost:3306/vaccinetracker", "root", "");
            PreparedStatement ps = con.prepareStatement("Insert into vaccines "
                    + "(vaccinename, amount) values(?,?)");
            ps.setString(1, getV());
            ps.setString(2, getA());
            int res = ps.executeUpdate();

            if (res == 1) {
                out.print("<script>alert('Vaccine Registered successfully')</script>");
                PreparedStatement hc=con.prepareStatement("select * from vaccines"); 
                
                ResultSet rs=hc.executeQuery();
                int centres = rs.getRow();
                      int quantityAmount = Integer.parseInt(getA());
                      int share = quantityAmount/5;
                while(rs.next()){
                    PreparedStatement ds = con.prepareStatement("Insert into distributions "
                    + "(healthcentrename, vaccinename, quantity) values(?,?,?)");
                    ds.setString(1, rs.getString(2));
                    ds.setString(2, getV());
                    ds.setInt(3, share);
                    int t = ds.executeUpdate();
                }
                 
                out.print("<script>window.location.href='vaccineinventory'</script>");
            } else {
                out.print("<script>alert('Not registered, try again')</script>");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    /**
     * @param v the v to set
     */
    public void setV(String v) {
        this.v = v;
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
     * @return the v
     */
    public String getV() {
        return v;
    }
}
