package com.comparable.comparator.example;

import java.util.ArrayList;
import java.util.Collections;

import com.project.pojos.Student;

//Creating a test class to sort the elements  
class ComparableSortExample {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println("Sorted by Age:" + st.getAge() + " " + st.getRollno() + " " + st.getName());
		}
	}
}