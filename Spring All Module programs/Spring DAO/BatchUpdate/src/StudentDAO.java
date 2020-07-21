import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StudentDAO extends JdbcDaoSupport {

	public void insertStudents() {
		
		String sql1 = "INSERT INTO STUDENT_DETAILS (NO, NAME, EMAIL, MOBILE) VALUES (201, 'ramesh', 'ramesh@gmail.com', '88888')";

		String sql2 = "INSERT INTO STUDENT_DETAILS (NO, NAME, EMAIL, MOBILE) VALUES (202, 'ramesh', 'ramesh@gmail.com', '88888')";

		String sql3 = "INSERT INTO STUDENT_DETAILS (NO, NAME, EMAIL, MOBILE) VALUES (203, 'ramesh', 'ramesh@gmail.com', '88888')";
		
		
		int[] i = getJdbcTemplate().batchUpdate(new String[]{sql1, sql2, sql3});

		System.out.println("No of rows inserted: " + i.length);
		
	}
	
	
	public void insertStudents(final List<Student> studentsList){
		
		System.out.println("Begin insertStudents " + new Date());
		
		String sql = "INSERT INTO STUDENT_DETAILS (NO, NAME, EMAIL, MOBILE) VALUES (?,?,?,?)";
		
		int[] i =getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				System.out.println("setValues called..." + i);
				
				Student student = studentsList.get(i);
				ps.setInt(1, student.getSno());
				ps.setString(2, student.getSname());
				ps.setString(3, student.getSemail());
				ps.setString(4, student.getSmobile());
			}
			
			@Override
			public int getBatchSize() {
				return studentsList.size();
			}
		});
		
		System.out.println("Size: " + i.length);
		System.out.println("End insertStudents " + new Date());
	}
	
}
