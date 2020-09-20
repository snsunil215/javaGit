package com.java.practise.objectCreation.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import com.java.practise.pojos.Employee;

public class WaysToCreateObject {
	public static void main(String[] args) throws Exception {
		// Step-1: Using new Keyword
		Employee emp = new Employee();
		emp.setEmployeeId(12345);
		emp.setEmployeeName("Rajendra");
		System.out.println(emp.toString());
		// Step-2: Using Class.forName() and instanceof method
		String className = "com.java.practise.pojos.Employee";
		Class clazz = Class.forName(className);
		emp = (Employee) clazz.getDeclaredConstructor().newInstance();
		emp.setEmployeeId(4567);
		emp.setEmployeeName("Srikanth");
		System.out.println(emp.toString());

		// Step-3: Using reflections
		Constructor<Employee> constructor = Employee.class.getConstructor();
		emp = constructor.newInstance();
		emp.setEmployeeId(7890);
		emp.setEmployeeName("Purna Chandra Rao");
		System.out.println(emp.toString());

		// Step-4: Using Deserialization
		String fileName = "serialize.txt";
		FileOutputStream fileOutputStream = new FileOutputStream("serialize.txt");
		ObjectOutputStream objs = new ObjectOutputStream(fileOutputStream);
		objs.writeObject(emp);
		objs.flush();
		objs.close();

		FileInputStream fins = new FileInputStream(fileName);
		ObjectInputStream objInput = new ObjectInputStream(fins);
		Employee employee = (Employee) objInput.readObject();
		System.out.println(employee.toString());

		// Step-5: Using clone method
		Employee employee2 = (Employee) employee.clone();
		System.out.println(employee2.toString());
		employee2.setEmployeeName("EmpNameCloned");
		System.out.println(employee.toString());
		System.out.println(employee2.toString());

	}
}
