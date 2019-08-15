package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Student;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class studentDao {
	public boolean isExist(String name) {
		return querybyname(name)==null?false:true;
	}
	public Student querybyname(String name) {
		Student student=null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String url="jdbc:mysql://localhost:3306/foke";
		String user="root";
		String password="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url, user, password);
			String sql="select * from student where name=?";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				String pwd=resultSet.getString("pwd");
				int age=resultSet.getInt("age");
				String address=resultSet.getString("address");
				student=new Student(name,pwd,age,address);
			}
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(preparedStatement!=null)preparedStatement.close();
				if(connection!=null)connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}

	public List<Student> querybyAll() {
		ArrayList<Student> students=new ArrayList<Student>();
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String url="jdbc:mysql://localhost:3306/foke";
		String user="root";
		String password="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url, user, password);
			String sql="select * from student";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				String name1=resultSet.getString("name");
				String pwd=resultSet.getString("pwd");
				int age=resultSet.getInt("age");
				String address=resultSet.getString("address");
				Student student=new Student(name1,pwd,age,address);
				students.add(student);
			}
			return students;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(preparedStatement!=null)preparedStatement.close();
				if(connection!=null)connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
}
	
	public boolean addStudent(Student student) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String url="jdbc:mysql://localhost:3306/foke";
		String user="root";
		String password="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url, user, password);
			String sql="insert into student values(?,?,?,?)";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getPwd());
			preparedStatement.setInt(3, student.getAge());
			preparedStatement.setString(4, student.getAddress());
			int flag=preparedStatement.executeUpdate();
			if (flag>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(preparedStatement!=null)preparedStatement.close();
				if(connection!=null)connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean deletebyname(String name) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String url="jdbc:mysql://localhost:3306/foke";
		String user="root";
		String password="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Context context=new InitialContext();
			DataSource dataSource=(DataSource)context.lookup("java:comp/env/student");
			connection=dataSource.getConnection();
			System.out.println("连接池！");
//			connection=DriverManager.getConnection(url, user, password);
			String sql="delete from student where name=?";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			int flag=preparedStatement.executeUpdate();
			if (flag>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(preparedStatement!=null)preparedStatement.close();
				if(connection!=null)connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean updatebyname(String name,Student student) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String url="jdbc:mysql://localhost:3306/foke";
		String user="root";
		String password="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url, user, password);
			String sql="update student set pwd=?,age=?,address=? where name=?";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getPwd());
			preparedStatement.setInt(2, student.getAge());
			preparedStatement.setString(3, student.getAddress());
			preparedStatement.setString(4, name);
			int flag=preparedStatement.executeUpdate();
			if (flag>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(preparedStatement!=null)preparedStatement.close();
				if(connection!=null)connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

