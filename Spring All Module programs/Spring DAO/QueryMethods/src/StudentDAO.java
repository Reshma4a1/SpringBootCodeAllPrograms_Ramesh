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

	public long getMaxStudentId() {
		String sql = "SELECT count(*) FROM STUDENT_DETAILS";
		long pkValue = jdbcTemplate.queryForLong(sql);
		return pkValue;
	}

	public int getStudentsCount() {
		String sql = "select count(*) from student_details";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	public String getStudentEmail(int no) {

		String sql = "select email from student_details where no=?";

		String email = jdbcTemplate.queryForObject(sql, new Object[] { no },
				new int[] { Types.INTEGER }, String.class);

		return email;

	}

	public Student getStudent(int id) {
		String sql = "select * from student_details where no=222";
		Student student = jdbcTemplate.queryForObject(sql,
				new RowMapper<Student>() {
					@Override
					public Student mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						System.out.println("mapRow method is called...: "
								+ rowNum);
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

	public Map<String, Object> getStudentMap() {

		String sql = "select * from student_details where no=222";

		Map<String, Object> map = jdbcTemplate.queryForMap(sql);

		return map;
	}

	public List<Map<String, Object>> getStudentsList() {

		String sql = "select * from student_details ";

		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

		return list;
	}

	public List<String> getStudentMobileNos() {

		String sql = "select mobile from student_details ";

		List<String> list = jdbcTemplate.queryForList(sql, String.class);

		return list;
	}

	public List<Student> getStudents() {
		String sql = "select * from student_Details where no>?";
		List<Student> list = jdbcTemplate.query(sql, new Object[] { 300 },
				new StudentRowMapper());
		return list;
	}

	public Map<String, List<Student>> getStudentsWithSubject() {
		String sql = "select * from student_Details";
		Map<String, List<Student>> map = jdbcTemplate.query(sql, new StudentResultSetExtractor());
		return map;
	}
}
