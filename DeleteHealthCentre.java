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
public class DeleteHealthCentre extends SimpleTagSupport {
    private String ID;

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
        PreparedStatement ps=con.prepareStatement("delete from healthcentres where ID=?");  
        ps.setString(1, getID());  
        int res = ps.executeUpdate();
        if(res ==1){ 
            out.print("<script>alert('Health Centre Deleted successfully')</script>");
            out.print("<script>window.location.href='healthcentres'</script>");
        } else {
            out.print("<script>alert('Not deleted, please try again')</script>");
        }
        con.close();  
    }catch(Exception e){System.out.println(e);} 
    }

    /**
     * @return the centre_id
     */
    public String getCentre_id() {
        return getID();
    }

    /**
     * @param centre_id the centre_id to set
     */
    public void setCentre_id(String centre_id) {
        this.setID(centre_id);
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
