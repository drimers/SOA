import java.util.ArrayList;
import java.util.List;

public class StudentService {

	List<Student> studentsDb;

	public StudentService() {
		studentsDb = new ArrayList<Student>();
		studentsDb.add(new Student("1234567", "Ivan Petrov", "CT"));
		studentsDb.add(new Student("5252525", "Goro Petrov", "CT"));
		studentsDb.add(new Student("6365636", "Stefan Petrov", "CT"));
		studentsDb.add(new Student("6363635", "Pesho Petrov", "CT"));
	}

	public List<Student> getAllStudents() {
		return studentsDb;
	}

	public Student getStudent(String facultyNumber) {

		// studentsDb.stream().filter(s ->
		// s.getFacultyNumber().equalsIgnoreCase(facultyNumber));

		for (Student student : studentsDb) {
			if (student.getFacultyNumber().equals(facultyNumber)) {
				return student;
			}
		}
		return null;
	}
}
