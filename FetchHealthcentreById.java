/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.health;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.sql.*;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author USER
 */
public class FetchHealthcentreById extends SimpleTagSupport {
    private String uid;
    private int col;
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
        PreparedStatement ps = con.prepareStatement("select * from healthcentres where centre_id=?");
		  //ps.setString(1, f);
                  ps.setInt(1, Integer.parseInt(getUid()));
                  ResultSet rs = ps.executeQuery();
        while(rs.next()){
            out.print(rs.getString(col));
        }
        con.close();  
    }catch(Exception e){System.out.println(e);} 
    }

    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }
}
