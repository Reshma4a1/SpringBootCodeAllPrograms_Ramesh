import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class StudentDAO extends NamedParameterJdbcDaoSupport {
	
	public void insertStudent(Student student) {

		String insertQuery = "INSERT INTO STUDENT_DETAILS (NO, NAME, EMAIL, MOBILE) "
				+ " VALUES (:no, :name, :email, :mobile)";

//		Map<String, Object> paramMap = new HashMap<String, Object>();
//		
//		paramMap.put("mobile", "4444");
//		paramMap.put("name", "Mahesh");
//		paramMap.put("email", "mahes@mahesh.com");
//		paramMap.put("no", 1000);
//		paramMap.put("age", 30);
		
		SqlParameterSource parameterSource = new MapSqlParameterSource()
												.addValue("no", 1001)
												.addValue("name", "Mohan")
												.addValue("email", "mohan@gmail.com")
												.addValue("mobile", "777777");
		
		
		
		int noOfRowsInserted = getNamedParameterJdbcTemplate().update(insertQuery, parameterSource);
		System.out.println("No Of Rows Inserted: " + noOfRowsInserted);
		
	}
}