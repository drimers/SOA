package client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.StudentServiceStub;
import org.apache.ws.axis2.StudentServiceStub.GetAllStudents;
import org.apache.ws.axis2.StudentServiceStub.GetAllStudentsResponse;
import org.apache.ws.axis2.StudentServiceStub.GetStudent;
import org.apache.ws.axis2.StudentServiceStub.GetStudentResponse;
import org.apache.ws.axis2.StudentServiceStub.Student;

public class StudentClient {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		StudentServiceStub stub = new StudentServiceStub();

		GetAllStudents param = new GetAllStudents();
		GetAllStudentsResponse allStudentsResponce = stub.getAllStudents(param);

		Student[] allStudents = allStudentsResponce.get_return();

		for (Student student : allStudents) {
			System.out.println("FNumber : [" + student.getFacultyNumber() + "] Name : [" + student.getName()
					+ "] Specialty : [" + student.getSpeciality() + "]");
		}

		GetStudent param2 = new GetStudent();

		param2.setFacultyNumber("1234567");

		GetStudentResponse response2 = stub.getStudent(param2);

		Student student2 = response2.get_return();

		System.out.println("##################################################################");
		System.out.println("FNumber : [" + student2.getFacultyNumber() + "] Name : [" + student2.getName()
				+ "] Specialty : [" + student2.getSpeciality() + "]");

	
		
		
//		StudentServiceStub stub = new StudentServiceStub();
//
//		GetAllStudents param = new GetAllStudents();
//
//		GetAllStudentsResponse response = stub.getAllStudents(param);
//
//		Student[] students = response.get_return();
//
//		for (Student student : students) {
//			System.out.printf("%s\t%s\t%s%n", student.getFacultyNumber(), student.getName(), student.getSpeciality());
//		}
//
//		GetStudent param2 = new GetStudent();
//		param2.setFacultyNumber("1234567");
//
//		GetStudentResponse response2 = stub.getStudent(param2);
//
//		Student student2 = response2.get_return();
//
//		System.out.println("====================================");
//		System.out.printf("%s\t%s\t%s%n", student2.getFacultyNumber(), student2.getName(), student2.getSpeciality());

	}

}
