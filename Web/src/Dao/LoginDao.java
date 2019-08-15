package Dao;

import java.sql.*;
import Model.login;

public class LoginDao {
	public static int login(login login) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String url="jdbc:mysql://localhost:3306/foke";
		String user="root";
		String password="123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url, user, password);
			String sql="select count(*) from student where name=? and pwd=?";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, login.getName());
			preparedStatement.setString(2, login.getPwd());
			resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				return resultSet.getInt(1);
			}else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
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
