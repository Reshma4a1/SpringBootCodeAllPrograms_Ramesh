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

	private static final String INSERT_STUDENT = "insert into STUDENT_DETAILS (NO, NAME, EMAIL, MOBILE) values (?,?,?,?)";
	private static final String UPDATE_STUDENT = "UPDATE STUDENT_DETAILS SET MOBILE=? WHERE NO=?";
	private static final String DELETE_STUDENT = "DELETE STUDENT_DETAILS WHERE NO=101";

	public void insertStudent(Student student) {

		Object[] params = new Object[] { student.getSno(), student.getSname(),
				student.getSemail(), student.getSmobile() };
		int[] paramTypes = new int[] { Types.INTEGER, Types.VARCHAR,
				Types.VARCHAR, Types.VARCHAR };

		int noOfRowsInserted = jdbcTemplate.update(INSERT_STUDENT, params,
				paramTypes);
		System.out.println("No Of Rows Inserted: " + noOfRowsInserted);
	}

	public void updateStudent(Student student) {
		int noOfRowsUpdated = jdbcTemplate.update(UPDATE_STUDENT,
				student.getSmobile(), student.getSno());
		System.out.println("No Of Rows Updated: " + noOfRowsUpdated);
	}

	public void deleteStudent() {
		int noOfRowsDeleted = jdbcTemplate.update(DELETE_STUDENT);
		System.out.println("No Of Rows Deleted: " + noOfRowsDeleted);
	}

	public void insertStudentWithPstmt(final Student student) {

		int i = jdbcTemplate.update(INSERT_STUDENT,	new PreparedStatementSetter() {
					@Override
					public void setValues(PreparedStatement ps)
							throws SQLException {
						ps.setInt(1, student.getSno());
						ps.setString(2, student.getSname());
						ps.setString(3, student.getSemail());
						ps.setString(4, student.getSmobile());
					}
				});

		System.out.println(i);
	}

}
