package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc {
	public static void update() {
		Connection connection=null;
	    PreparedStatement	statement=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/foke";
		String user="root";
		String pwd="123456";
		connection=DriverManager.getConnection(url,user,pwd);
		
		String sql="update student set name='MamBa' where age=22";
		statement=connection.prepareStatement(sql);
		statement.execute();
			System.out.print("²Ù×÷³É¹¦!");
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(statement!=null) statement.close();
					if(connection!=null) connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	public static void main(String[] args) {
		update();
	}
}
