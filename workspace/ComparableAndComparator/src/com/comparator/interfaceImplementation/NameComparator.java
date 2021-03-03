package com.comparator.interfaceImplementation;

import java.util.Comparator;

import com.project.pojos.Student;

public class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}