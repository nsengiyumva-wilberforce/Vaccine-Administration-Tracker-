/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.health.vaccine;


import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;  
import java.sql.*;  
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
  
public class FetchAllVaccinesHandler extends TagSupport{    
public int doStartTag()throws JspException{  
    JspWriter out=pageContext.getOut();  
    try{   
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con;
                    con = DriverManager.getConnection( 
                            "jdbc:mysql://localhost:3306/vaccinetracker","root",""); 
        PreparedStatement ps=con.prepareStatement("select * from vaccines");   
        ResultSet rs=ps.executeQuery(); 
        out.print("<table\n" +
"                                    id=\"zero_config\"\n" +
"                                    class=\"table table-striped table-bordered\"\n" +
"                                    >\n" +
"                                    <thead>\n" +
"                                        <tr>\n" +
"                                            <th>Vaccine ID</th>\n" +
"                                            <th>Vaccine Name</th>\n" +
"                                            <th>Quantity</th>\n" +
"                                            <th>Actions</th>\n" +
"                                        </tr>\n" +
"                                    </thead>\n" +
"                                    <tbody>");
       while(rs.next()){
          out.write("<tr>\n" +
"                                            <td>"+rs.getInt(1)+"</td>\n" +
"                                            <td>"+rs.getString(2)+"</td>\n" +
"                                            <td>"+rs.getString(3)+"</td>\n" +
"                                            <td><a type=\"button\" href=\"updateUser?delete_vaccine="+rs.getInt(1)+"\" class=\"btn btn-cyan btn-sm text-white\">\n" +
"                                                    Edit\n" +
"                                                </a><a type=\"button\" href=\"vaccineinventory?delete_vaccine="+rs.getString(1)+"\" class=\"btn btn-danger btn-sm text-white\">\n" +
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