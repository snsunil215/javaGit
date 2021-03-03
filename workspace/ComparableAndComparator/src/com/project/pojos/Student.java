package com.project.pojos;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
