package com.home.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Cloneable {

	private static List<Student> studentList;
	static {
		studentList = new ArrayList<>();

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Vivek Garg");

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Prabhat Singh");

		studentList.add(student1);
		studentList.add(student2);
	}

	public List<Student> getAllStudents() {
		return studentList;
	}

	@Override
	public List<Student> clone() throws CloneNotSupportedException {
		List<Student> dummyStudentList=new ArrayList<>();
		for (Student student : studentList) {
			dummyStudentList.add(student);
		}
		return dummyStudentList;
	}

}
