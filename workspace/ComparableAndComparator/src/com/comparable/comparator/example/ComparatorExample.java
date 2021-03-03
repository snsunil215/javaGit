package com.comparable.comparator.example;

import java.util.ArrayList;
import java.util.Collections;

import com.comparator.interfaceImplementation.AgeComparator;
import com.comparator.interfaceImplementation.NameComparator;
import com.comparator.interfaceImplementation.RollNoComparator;
import com.project.pojos.Student;

public class ComparatorExample {
	public static void main(String args[]) {
		// Creating a list of students
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");
		// Using NameComparator to sort the elements
		System.out.println("Using NameComparator to sort the elements");
		Collections.sort(al, new NameComparator());
		// Traversing the elements of list
		for (Student st : al) {
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}

		System.out.println("sorting by Age");
		// Using AgeComparator to sort the elements
		System.out.println("Using AgeComparator to sort the elements");
		Collections.sort(al, new AgeComparator());
		// Travering the list again
		for (Student st : al) {
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}
		System.out.println("Using RollNoComparator to sort the elements");
		Collections.sort(al, new RollNoComparator());
		al.stream().forEach(st -> System.out.println((st.getRollno() + " " + st.getName() + " " + st.getAge())));

	}
}
