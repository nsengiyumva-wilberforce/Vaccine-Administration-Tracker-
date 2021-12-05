/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.health;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author user
 */
public class addbooking extends SimpleTagSupport {

    private String person;
    private String healthcentre;
    private String vaccine;
    private String date;
    private String time;

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
            PreparedStatement ps = con.prepareStatement("Insert into booking values(?,?,?,?,?)");
            ps.setString(2, getPerson());
            ps.setString(3, getHealthCentre());
            ps.setString(4, getVaccine());
            ps.setString(5, getDate());
            ps.setString(6, getTime());
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
    
    
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
    
        public String getHealthCentre() {
        return healthcentre;
    }

    public void setHealthcentre(String healthcentre) {
        this.healthcentre = healthcentre;
    }
    
    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
