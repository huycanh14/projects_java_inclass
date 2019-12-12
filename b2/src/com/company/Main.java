package com.company;

import com.model.Student;
import com.model.StudentManagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Câu 2
		 */
		Student studentTest = new Student();
		
		/*
		 * Câu 6
		 */
		studentTest.setName("Đặng Huy Cảnh");
		studentTest.setId("1412");
		studentTest.setGroup("K61ACNPM");
		studentTest.setEmail("huycanh14@gmail.com");
		
		System.out.println(studentTest.getName());
		System.out.println(studentTest.getInfo());
		System.out.println("-----------------------------------------");
		//------------------------------------------
		/*
		 * Câu 8
		 */
		Student studentOne = new Student();
		System.out.println(studentOne.getInfo());
		
		Student studentTwo = new Student("Trần Văn A", "0001", "abc@gmail.com");
		System.out.println(studentTwo.getInfo());
		
		Student studentThree = new Student(studentTest);
		System.out.println(studentThree.getInfo());
		System.out.println("-----------------------------------------");
		/*
		 * Câu 10
		 */
		StudentManagement studentManagement = new StudentManagement();
		System.out.println(studentManagement.sameGroup(studentOne, studentTwo));
		System.out.println(studentManagement.sameGroup(studentTwo, studentThree));
		System.out.println(studentManagement.sameGroup(studentOne, studentThree));
		System.out.println("-----------------------------------------");
		/*
		 * Câu 11
		 */
		studentManagement.addStudent(studentTest);
		studentManagement.addStudent(studentOne);
		studentManagement.addStudent(studentTwo);
		studentManagement.addStudent(studentThree);
		/*
		 * Câu 12
		 */
		studentManagement.studentByGroup();
		System.out.println("-----------------------------------------");
		/*
		 * Câu 13
		 */
		studentManagement.removeStudent("000");
		studentManagement.studentByGroup();
		System.out.println("-----------------------------------------");
	}

}
