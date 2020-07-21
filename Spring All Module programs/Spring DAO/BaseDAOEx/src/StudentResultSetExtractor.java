import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentResultSetExtractor implements
		ResultSetExtractor<Map<String, List<Student>>> {
	
	@Override
	public Map<String, List<Student>> extractData(ResultSet rs)
			throws SQLException, DataAccessException {

		
		Map<String, List<Student>> map = new HashMap<String, List<Student>>();
		
		List<Student> springList  = new ArrayList<Student>();
		
		while (rs.next()) {
			Student student = new Student();
			
			student.setSno(rs.getInt("NO"));
			student.setSname(rs.getString("NAME"));
			student.setSemail(rs.getString("EMAIL"));
			student.setSmobile(rs.getString("MOBILE"));
			springList.add(student);
		}
		
		map.put("Spring", springList);
		return map;
	}
}
