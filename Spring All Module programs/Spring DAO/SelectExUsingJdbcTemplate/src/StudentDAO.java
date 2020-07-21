import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private static final String STUDENT_COUNT = "SELECT COUNT(*) FROM STUDENT_DETAILS";
	private static final String STUDENT_MAX_ID = "SELECT NAME FROM STUDENT_DETAILS WHERE NO = 999";

	public long getStudentsCount() {
		long count = jdbcTemplate.queryForLong(STUDENT_COUNT);
		return count;
		// return
		// jdbcTemplate.queryForInt("SELECT COUNT(*) FROM STUDENT_DETAILS");
	}

	public int getMaxStudentID() {
		// return jdbcTemplate.queryForInt(STUDENT_MAX_ID);
		return jdbcTemplate.queryForObject(STUDENT_MAX_ID, Integer.class);
	}

	public String getStudentName(int id) {
		String sql = "SELECT NAME FROM STUDENT_DETAILS WHERE NO=999";

		String name = jdbcTemplate.queryForObject(sql, String.class);

		return name;

	}

	public Student getStudent(int id) {
		String sql = "SELECT * FROM STUDENT_DETAILS";
		Student student = jdbcTemplate.queryForObject(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				System.out.println("mapRow of method of RowMapper is called...");

				Student student = new Student();
				
				student.setSno(rs.getInt("NO"));
				student.setSname(rs.getString("NAME"));
				student.setSemail(rs.getString("EMAIL"));
				student.setSmobile(rs.getString("MOBILE"));
				
				return student;
			}
		});
		return student;
	}

	public Map<String, Object> getStudentWithColumn(int id) {

		String sql = "SELECT * FROM STUDENT_DETAILS WHERE NO=999";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		return map;

	}

	public List<Map<String, Object>> getStudentListWithColumn() {

		String sql = "SELECT * FROM STUDENT_DETAILS";

		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

		return list;

	}

	public List<String> getStudentEmails() {

		String sql = "SELECT EMAIL FROM STUDENT_DETAILS";

		List<String> emailsList = jdbcTemplate.queryForList(sql, String.class);

		return emailsList;

	}
	
	
	public Map<String, Object> getStudents(){
		String sql = "select * from student_details";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		return map;
	}
	
	

	private static final class StdRowMapper implements RowMapper<Student> {
		
		
		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("mapRow of inner class method is called...");

			Student student = new Student();
			
			student.setSno(rs.getInt("NO"));
			student.setSname(rs.getString("NAME"));
			student.setSemail(rs.getString("EMAIL"));
			student.setSmobile(rs.getString("MOBILE"));
			
			return student;
		}
	}

}
