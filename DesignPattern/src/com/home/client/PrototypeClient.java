package com.home.client;

import java.util.List;

import com.home.prototype.Student;
import com.home.prototype.StudentDao;

public class PrototypeClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		StudentDao studentDao=new StudentDao();
		List<Student> allStudents = studentDao.getAllStudents();
		System.out.println("Original Candidates List: ");
		for (Student student : allStudents) {
			System.out.println(student);
		}
		
		List<Student> updatedStudentList = studentDao.clone();
		Student student = new Student();
		student.setId(3);
		student.setName("Shubham");
		System.out.println("Updated Candidates List: ");
		updatedStudentList.add(student);
		for (Student studentData : updatedStudentList) {
			System.out.println(studentData);
		}
	}
}
