import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("mapRow method is called...");

		Student student = new Student();
		
		student.setSno(rs.getInt("NO"));
		student.setSname(rs.getString("NAME"));
		student.setSemail(rs.getString("EMAIL"));
		student.setSmobile(rs.getString("MOBILE"));
		
		return student;
	}

}
