package com.comparator.interfaceImplementation;

import java.util.Comparator;

import com.project.pojos.Student;

public class AgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.getAge() == s2.getAge())
			return 0;// if equal return 0
		else if (s1.getAge() > s2.getAge())
			return 1;// if > return 1
		else
			return -1;  // if less return -1
	}
}
