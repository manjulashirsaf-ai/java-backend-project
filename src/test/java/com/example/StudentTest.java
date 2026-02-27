package com.example;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student("Manjula", 44, 9.8);
		student.display();
		
		System.out.println("Updating the student details: ");
		student.setName("Aditi");
		student.setAge(16);
		student.setGPA(10);
		student.display();
		
		System.out.println(student.getName() + " " + student.getAge() + " "+ student.getGrade());
	}
}
