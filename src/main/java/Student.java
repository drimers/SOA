
public class Student {
	
	private String facultyNumber;
	private String name;
	private String speciality;
	
	public Student(String facultyNumber, String name, String speciality) {
	
		this.facultyNumber = facultyNumber;
		this.name = name;
		this.speciality = speciality;
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
	
	
}
