package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/config.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


String mysql_host = "localhost";
String mysql_username = "root";
String mysql_password = "";
String mysql_db = "jsp_final";


      out.write('\n');
      out.write('\n');


Object user_id = session.getAttribute("user_id");
if (user_id != null) {
	response.sendRedirect("home.jsp");
}

String username = null;
if (request.getParameter("registered") != null) {
	username = request.getParameter("registered");
}
if (request.getParameter("username") != null) {
	username = request.getParameter("username");
}

Connection connect = null;
Statement statement = null;

String error_text = null;

if ("POST".equalsIgnoreCase(request.getMethod())) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connect =  DriverManager.getConnection("jdbc:mysql://" + mysql_host + "/" + mysql_db + "" +"?user=" + mysql_username + "&password=" + mysql_password);
		statement = connect.createStatement();
		ResultSet result = statement.executeQuery("SELECT * FROM `users` WHERE `username` = '" + request.getParameter("username") + "' AND `password` = '" + request.getParameter("password") + "';");
		if (result.next()) {
			session.setAttribute("user_id", result.getString("id"));
			if (request.getParameter("remember_me") != null) {
				session.setMaxInactiveInterval(86400);
			} else {
				session.setMaxInactiveInterval(900);
			}
			response.sendRedirect("home.jsp");
		} else {
			error_text = "ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง";
		}
	}  catch (Exception e) {
		error_text = e.getMessage();
	}
	try {
		if (statement != null){
			statement.close();
			connect.close();
		}
	} catch (SQLException e) {
	}
}


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("  @import \"https://use.fontawesome.com/releases/v5.5.0/css/all.css\";\n");
      out.write("body{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  background: url(assets/img/bg.jpg) no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write(".login-box{\n");
      out.write("  width: 280px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%,-50%);\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".login-box h1{\n");
      out.write("  float: left;\n");
      out.write("  font-size: 40px;\n");
      out.write("  border-bottom: 6px solid #4caf50;\n");
      out.write("  margin-bottom: 50px;\n");
      out.write("  padding: 13px 0;\n");
      out.write("}\n");
      out.write(".textbox{\n");
      out.write("  width: 100%;\n");
      out.write("  overflow: hidden;\n");
      out.write("  font-size: 20px;\n");
      out.write("  padding: 8px 0;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border-bottom: 1px solid #4caf50;\n");
      out.write("}\n");
      out.write(".textbox i{\n");
      out.write("  width: 26px;\n");
      out.write("  float: left;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".textbox input{\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  background: none;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 18px;\n");
      out.write("  width: 80%;\n");
      out.write("  float: left;\n");
      out.write("  margin: 0 10px;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("  width: 100%;\n");
      out.write("  background: none;\n");
      out.write("  border: 2px solid #4caf50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 5px;\n");
      out.write("  font-size: 18px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin: 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("  <form ation=\"login.jsp\" method=\"post\">\n");
      out.write("<div class=\"login-box\">\n");
      out.write("  <h1>ลงชื่อเข้าใช้</h1>\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    <i class=\"fas fa-user\"></i>\n");
      out.write("    <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\" placeholder=\"ชื่อผู้ใช้\" value=\"");
 if (username != null) { out.print(username); } 
      out.write("\" required ");
 if (request.getParameter("registered") == null) { out.print("autofocus"); } 
      out.write(">\n");
      out.write("            <label for=\"username\">ชื่อผู้ใช้</label>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    <i class=\"fas fa-lock\"></i>\n");
      out.write("    <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" placeholder=\"รหัสผ่าน\" required ");
 if (request.getParameter("registered") != null) { out.print("autofocus"); } 
      out.write(">\n");
      out.write("            <label for=\"password\">รหัสผ่าน</label>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <input type=\"submit\" class=\"btn\" value=\"Sign in\">\n");
      out.write("  <br>\n");
      out.write("  <a href=\"register.jsp\"><input type=\"button\" class=\"btn\" value=\"สมัคสมาชิก\"></a>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
