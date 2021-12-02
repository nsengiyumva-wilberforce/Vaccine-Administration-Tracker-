/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package org.taghandlers;
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;  
import java.sql.*;  
  
public class BackendTags extends TagSupport{  
private String username;  
private String email;  
private String role; 
private String password; 
  
public void setUsername(String username) {  
    this.username = username;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public void setRole(String role) {  
    this.role = role;  
}  
public void setPassword(String password) {  
    this.password = password;  
}  
  
@Override
public int doStartTag()throws JspException{  
    JspWriter out=pageContext.getOut();  
     int status=0;  
    try{   
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con;
                    con = DriverManager.getConnection( 
                            "jdbc:mysql://localhost:3306/vaccinetracker","root","wilber4c"); 
        PreparedStatement ps=con.prepareStatement(  
"insert into users(username,email,role,password) values(?,?,?,?)");  
        ps.setString(1,username);  
        ps.setString(2,email);  
        ps.setString(3,role);  
        ps.setString(4,password);    
        status=ps.executeUpdate();   
        con.close();  
    }catch(Exception e){
        System.out.println("Didnt work");}  
    return SKIP_BODY;  
}  
} 