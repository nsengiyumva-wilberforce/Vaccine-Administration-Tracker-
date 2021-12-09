/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.health;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author User
 */
public class HealthCentreDetails extends SimpleTagSupport {
    private String p;

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
        PreparedStatement ps=con.prepareStatement("select * from healthcentres");  
        ResultSet rs=ps.executeQuery(); 
        out.print("<table\n" +
"                                    id=\"zero_config\"\n" +
"                                    class=\"table table-striped table-bordered\"\n" +
"                                    >\n" +
"                                    <thead>\n" +
"                                        <tr>\n" +
"                                            <th>Centre ID</th>\n" +
"                                            <th>Health Centre Name</th>\n" +
"                                            <th>Address</th>\n" +
"                                            <th>Patients</th>\n" + 
"                                            <th>Vaccines Available</th>\n" +
"                                            <th>Vaccines Needed</th>\n" +                
"                                            <th>Actions</th>\n" +
"                                        </tr>\n" +
"                                    </thead>\n" +
"                                    <tbody>");
       while(rs.next()){
          out.write("<tr>\n" +
"                                            <td>"+rs.getInt(1)+"</td>\n" +
"                                            <td>"+rs.getString(2)+"</td>\n" +
"                                            <td>"+rs.getString(3)+"</td>\n" +
                                             "<td></td>\n" +
                                              "<td></td>\n" +
                                               "<td></td>\n" +
"                                            <td><a type=\"button\" href=\"updatehealthcentre?update_centre="+rs.getString(1)+"\" class=\"btn btn-cyan btn-sm text-white\">\n" +
"                                                    Edit\n" +
"                                                </a><a type=\"button\" href=\"healthcentres?delete_health_centre="+rs.getInt(1)+"\" class=\"btn btn-danger btn-sm text-white\">\n" +
"                                                    Delete\n" +
"                                                </a>\n" +
"                                                <a type=\"button\" href=\"viewhealthcentre.jsp?view_centre="+rs.getString(1)+"\" class=\"btn btn-primary btn-sm text-white\">\n" +
"                                                    View\n" +
"                                                </a></td>\n" +
"                                        </tr>");
       }
       out.print("</tbody></table>");
       
        con.close(); 
        } catch(Exception e){System.out.println(e);}  
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
    }
    

