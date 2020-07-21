import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public void insertSudent(final Student student) {
		jdbcTemplate.execute(new StudentConnectionCallback());
	}

	private final class StudentConnectionCallback implements ConnectionCallback<Integer> {

		@Override
		public Integer doInConnection(Connection con) throws SQLException,
				DataAccessException {
			
			String query = "insert into student_details values(108,'Raju','raju@gmail.com','4444444')";
			Statement statement = con.createStatement();//adv java 
			Integer rowsInserted = statement.executeUpdate(query);//adv java
			return rowsInserted;
		}
	}
}
