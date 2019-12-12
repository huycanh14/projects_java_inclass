package com.model;

import java.util.ArrayList;

public class StudentManagement {
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup().equals(s2.getGroup());
	}
	
	public void studentByGroup() {
		System.out.println("Student in group: ");
		for(Student std: this.students) {
			System.out.println(std.getInfo());
		}
	}
	
	public void removeStudent(String id) {
		for(Student std: this.students) {
			if(std.getId().equals(id)) {
				this.students.remove(std);
				break;
			}
		}
	}
}
