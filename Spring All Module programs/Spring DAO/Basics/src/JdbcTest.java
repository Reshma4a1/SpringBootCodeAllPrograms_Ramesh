import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("driver class");
		
		Connection connection;
		try {
			connection = DriverManager.getConnection("", "", "");
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select query");
			
			while (resultSet.next()) {
				int no = resultSet.getInt(1);
				String name = resultSet.getString("2");
//				Employee e = new Employee();
//				e.setName(name);
//				e.setno(no);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//close all these object.
		}

	}
}
