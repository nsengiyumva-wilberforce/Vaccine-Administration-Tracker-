/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.health;

import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;  
import java.sql.*;  
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
  
public class FetchBookings extends TagSupport{    
public int doStartTag()throws JspException{  
    JspWriter out=pageContext.getOut();  
    try{   
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con;
                    con = DriverManager.getConnection( 
                            "jdbc:mysql://localhost:3306/vaccinetracker","root","wilber4c"); 
        PreparedStatement ps=con.prepareStatement("select * from booking");   
        ResultSet rs=ps.executeQuery(); 
        out.print("<table\n" +
"                                    id=\"zero_config\"\n" +
"                                    class=\"table table-striped table-bordered\"\n" +
"                                    >\n" +
"                                    <thead>\n" +
"                                        <tr>\n" +
"                                            <th>Person</th>\n" +
"                                            <th>Health Centre</th>\n" +
"                                            <th>Vaccine</th>\n" +
"                                            <th>Date</th>\n" +
"                                            <th>Time</th>\n" +
"                                            <th>Actions</th>\n" +
"                                        </tr>\n" +
"                                    </thead>\n" +
"                                    <tbody>");
       while(rs.next()){
          out.write("<tr>\n" +
"                                            <td>"+rs.getString(2)+"</td>\n" +
"                                            <td>"+rs.getString(3)+"</td>\n" +
"                                            <td>"+rs.getString(4)+"</td>\n" +
"                                            <td>"+rs.getString(5)+"</td>\n" +
"                                            <td>"+rs.getString(6)+"</td>\n" +
"                                            <td><a type=\"button\" href=\"updateUser?update_username="+rs.getString(1)+"\" class=\"btn btn-cyan btn-sm text-white\">\n" +
"                                                    Edit\n" +
"                                                </a><a type=\"button\" href=\"systemsadministration?delete_username="+rs.getString(1)+"\" class=\"btn btn-danger btn-sm text-white\">\n" +
"                                                    Delete\n" +
"                                                </a>\n" +
"                                                <a type=\"button\" href=\"viewuser\" class=\"btn btn-primary btn-sm text-white\">\n" +
"                                                    View\n" +
"                                                </a></td>\n" +
"                                        </tr>");
       }
       out.print("</tbody></table>");
       
        con.close();  
    }catch(Exception e){System.out.println(e);}  
    return SKIP_BODY;  
}  
} 