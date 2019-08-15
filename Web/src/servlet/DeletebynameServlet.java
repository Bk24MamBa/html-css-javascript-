package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.studentService;

@WebServlet("/DeletebynameServlet")
public class DeletebynameServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		studentService service=new studentService();
		boolean flag=service.deletebyname(name);
//		if(flag) {
//			response.sendRedirect("QuerybyallServlet");
//		}else {
//			response.sendRedirect("QuerybyallServlet");
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
