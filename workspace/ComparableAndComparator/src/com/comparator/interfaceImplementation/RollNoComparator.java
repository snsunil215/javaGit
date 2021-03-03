package com.comparator.interfaceImplementation;

import java.util.Comparator;

import com.project.pojos.Student;

public class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getRollno() == o2.getRollno()) {
			return 0;
		} else if (o1.getRollno() > o2.getRollno()) {
			return 1;
		} else {
			return -1;
		}
	}

}
