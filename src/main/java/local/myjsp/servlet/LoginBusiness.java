package local.myjsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import local.myjsp.entity.User;
import local.myjsp.persist.dao.UserService;

public class LoginBusiness extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
 
	@Override		//这个方法会被客户端发来的Get所调用-> HTML代码里的 <form method="get">
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		System.out.println("GET");
		String res = getReqAttrs(req); 
		resp.setContentType("text/html");
		resp.getWriter().println("GET-- HttpServletRequest: " + res);
		super.doGet(req, resp);
	}

	@Override	// <form method="post">
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		String res = getReqAttrs(req); 
		//HttpServletRequest.getParameter获取 HTML标签中属性 name="un" 的标签的值
		Object username = req.getParameter("un");	//注意！不是 getAttribute("username");详情请见/myjsp/Document/java中getAttribute和getParameter的区别
		Object password = req.getParameter("pw");	//详情请见 /myjsp/Document/HTML中id和name区别

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		if( checkIdentity((String)username,(String)password) )
			out.write("成功登录\nPOST:\nusername: "+username + "\npassword: "+password);
		else
			out.write("登录失败");
		out.flush();
		super.doPost(req, resp);
	}

	private boolean checkIdentity(String username, String password) {
		User user =  UserService.findById(Integer.parseInt( username ));
		if( user != null && password.equals( user.getPassword() ) )
			return true;
		return false;
	}
	
	//用于session的属性获取
	public String getReqAttrs(HttpServletRequest req) {
		Enumeration< String > requestEnumStr = req.getAttributeNames();
		String res = "";
		while (requestEnumStr.hasMoreElements()){
			res += requestEnumStr.nextElement()+"\n";
		}
		return res;
	}
	
}
