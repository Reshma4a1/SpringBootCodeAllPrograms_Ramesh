import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class StudentDAO extends HibernateDaoSupport {
	
	
	public void insertStudent(Student student) {
		getHibernateTemplate().save(student);
	}

	public void updateStudent(Student student) {
		getHibernateTemplate().update(student);
	}

	public void deleteStudent(Student student) {
		getHibernateTemplate().delete(student);
	}

	public Student getStudentDeails(int id) {
		return (Student)getHibernateTemplate().get(Student.class, id);
	}

	public List<Student> getStudents() {

		List<Student> studentsList = getHibernateTemplate().execute(new HibernateCallback<List<Student>>() {

					@Override
					public List<Student> doInHibernate(Session session)
							throws HibernateException, SQLException {

//						Query query = session.createQuery("from Student s");
//						List<Student> list = query.list();
						
						Criteria criteria = session.createCriteria(Student.class);
						List<Student> list = criteria.list();
						
						return list;
					}
				});
		return studentsList;
	}
}
