package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


String mysql_host = "localhost";
String mysql_username = "root";
String mysql_password = "";
String mysql_db = "jsp_final";


      out.write('\n');
      out.write('\r');
      out.write('\n');


Object user_id = session.getAttribute("user_id");
if (user_id == null) {
	response.sendRedirect("login.jsp");
}

Connection connect = null;
Statement statement = null;

try {
	Class.forName("com.mysql.jdbc.Driver");
	connect =  DriverManager.getConnection("jdbc:mysql://" + mysql_host + "/" + mysql_db + "" +"?user=" + mysql_username + "&password=" + mysql_password);
	statement = connect.createStatement();
	ResultSet user_data = statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + user_id.toString() + "';");
	if (!user_data.next()) {
		session.removeAttribute("user_id");
		response.sendRedirect("login.jsp");
	}
}  catch (Exception e) {
	out.println(e.getMessage());
	e.printStackTrace();
}
try {
	if (statement != null){
		statement.close();
		connect.close();
	}
} catch (SQLException e) {
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <title>ผู้จัดทำ</title>\r\n");
      out.write("\t<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"assets/css/offcanvas.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script defer src=\"assets/js/all.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  font-family: sans-serif;\r\n");
      out.write("  background: url(assets/img/bg.jpg) no-repeat;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write(".h2{\r\n");
      out.write("\tcolor:#fff\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body class=\"bg-light\">\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg fixed-top navbar-dark bg-dark\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand mb-0 h1\" href=\"#\">JSP Final</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"home.jsp\"><i class=\"fas fa-home\"></i>&nbsp; หน้าหลัก</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"data.jsp\"><i class=\"fas fa-list\"></i>&nbsp; รายชื่อผู้ใช้</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"map.jsp\"><i class=\"fas fa-map-marked-alt\"></i>&nbsp; แผนที่</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"><i class=\"fas fa-id-card\"></i>&nbsp; ผู้จัดทำ</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"logout.jsp\"><i class=\"fas fa-sign-out-alt\"></i>&nbsp; ออกจากระบบ</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<br><br><br><br>\r\n");
      out.write("\t<main role=\"main\" class=\"container\">\r\n");
      out.write("\t\t<h2 class=\"h2\"><i class=\"fas fa-id-card\"></i>&nbsp; ผู้จัดทำ</h2>\r\n");
      out.write("\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t<div class=\"row text-center pt-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 pb-4\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"สุขเกษม สังสัมพันธ์\" class=\"rounded-circle shadow\" width=\"140\" height=\"140\" src=\"assets/img/c.jpg\" />\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"pt-4 mb-3\">ผู้พัฒนาระบบ</h5>\r\n");
      out.write("\t\t\t\t\t\t<h2>นายสุขเกษม สังสัมพันธ์</h2>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-muted\">รหัสประจำตัวนักศึกษา: 6139010013</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"pt-3\"><a class=\"btn btn-primary\" href=\"https://www.facebook.com/champion.king.31\" role=\"button\"><i class=\"fab fa-facebook-square\"></i>&nbsp; @Champ Sukasem</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 pb-4\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"นายสานูซี เซ็ง\" class=\"rounded-circle shadow\" width=\"140\" height=\"140\" src=\"assets/img/s.jpg\" />\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"pt-4 mb-3\">ผู้ช่วยพัฒนาระบบ</h5>\r\n");
      out.write("\t\t\t\t\t\t<h2>นายสานูซี เซ็ง</h2>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-muted\">รหัสประจำตัวนักศึกษา: 6139010018</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"pt-3\"><a class=\"btn btn-primary\" href=\"https://www.facebook.com/sanusee.seng.9\" role=\"button\"><i class=\"fab fa-facebook-square\"></i>&nbsp; @Sanusee Seng</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 pb-4\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"ธีระ บินกาเซ็ม\" class=\"rounded-circle shadow\" width=\"140\" height=\"140\" src=\"assets/img/t.jpg\" />\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"pt-4 mb-3\">ครูที่ปรึกษา</h5>\r\n");
      out.write("\t\t\t\t\t\t<h2>นายธนีระ บินกาเซ็ม</h2>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"text-muted\">หัวหน้าแผนกวิชา เทคโนโลยีสารสนเทศ</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"pt-3\"><a class=\"btn btn-primary\" href=\"https://www.facebook.com/BillKasem\" role=\"button\"><i class=\"fab fa-facebook-square\"></i>&nbsp; @Teera binksem</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<p class=\"mt-4 small text-muted text-center\">&copy; 2019 Likecyber</p>\r\n");
      out.write("\t<script defer src=\"assets/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t<script defer src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
