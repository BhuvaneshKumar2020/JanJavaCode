package org.Polymorphism;

public class Student extends Overridding {
	public void marks() {
			System.out.println("But 40 is the pass mark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridding teacher = new Student();
teacher.Lesson();
	teacher.marks();
	}

}
