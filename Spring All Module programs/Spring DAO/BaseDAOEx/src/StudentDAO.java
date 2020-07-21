import org.springframework.jdbc.core.support.JdbcDaoSupport;



public class StudentDAO extends JdbcDaoSupport {
	
	public int getStudentMaxID(){
		String sql = "SELECT MAX(NO) FROM STUDENT_DETAILS";
		int maxID = getJdbcTemplate().queryForInt(sql);
		return maxID;
		
	}
}
