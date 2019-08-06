package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;
import service.studentService;

@WebServlet("/AddstudentServlet")
public class AddstudentServlet extends HttpServlet {
	private static final long serialVersionUID = -4003368918984645520L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		int age=Integer.parseInt(request.getParameter("age"));
		String address=request.getParameter("address");
		Student student=new Student(name, pwd, age, address);
		studentService service=new studentService();
		service.addstudent(student);
		response.sendRedirect("QuerybyallServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
