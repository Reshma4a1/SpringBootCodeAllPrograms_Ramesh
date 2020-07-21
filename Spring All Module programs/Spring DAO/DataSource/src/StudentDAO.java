import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertSudent(final Student student) {

		String insertQuery = "insert into STUDENT_DETAILS (NO, NAME, EMAIL, MOBILE) values (?, ?, ?, ?)";

		int noOfRowsInserted = jdbcTemplate.update(insertQuery, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				System.out.println("setValues method called..");
				ps.setInt(1, student.getSno());
				ps.setString(2, student.getSname());
				ps.setString(3, student.getSemail());
				ps.setString(4, student.getSmobile());
			}
		});

		System.out.println("noOfRowsInserted: " + noOfRowsInserted);
	}

	public void updateStudent(Student student) {
		String updateQuery = "UPDATE STUDENT_DETAILS SET EMAIL=?, MOBILE=? WHERE NO=?";

		jdbcTemplate.update(updateQuery, student.getSemail(),
				student.getSmobile(), student.getSno());

	}

	public void deleteStudent() {
	}

}
