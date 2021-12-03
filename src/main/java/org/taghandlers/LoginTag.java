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
public class LoginTag extends SimpleTagSupport {
    private String username, password;

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
                            "jdbc:mysql://localhost:3306/vaccinetracker","root","wilber4c"); 
        PreparedStatement ps=con.prepareStatement("select * from users where username=? and password=?");  
        ps.setString(1, username);  
        ps.setString(2, password);
        ResultSet rs=ps.executeQuery();  
        if(rs.next()){ 
            out.print("<script>window.location.href='StartSession?S=1'</script>");
        } else {
            out.print("<center><font style='color:red;'>Username or password are Wrong</font></center>'");
        }
        con.close();  
    }catch(Exception e){System.out.println(e);} 
    }    

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
