package com.model;

public class Teacher {
	private String name = "Trần Văn A";
    private String teachAtSchool = "Đại học Mỏ địa chất Hà Nội";
    private String dateOfBirth = "28/09";
    private int age = 30;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeachAtSchool() {
		return teachAtSchool;
	}
	public void setTeachAtSchool(String teachAtSchool) {
		this.teachAtSchool = teachAtSchool;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
