package Collections_and_Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

class Programm {
	
		static class Student{
		String name;
		int course;
		Student(String name, int course){
			this.name = name;
			this.course = course;
		}
		public int getCourse() {
			return course;
		}
		public String getName() {
			return name;
		}
		
		
	}
	
	private static void printStudents(List<Student> students, int course) {
		ListIterator<Student> students_iter = students.listIterator();
		while(students_iter.hasNext()) {
			if(students_iter.next().getCourse() == course)
				System.out.println(students_iter.next().getName());
			
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Jacob", 1));
		students.add(new Student("Nastya", 2));
		students.add(new Student("Viktor", 3));
		students.add(new Student("Yuly", 1));
		students.add(new Student("Vitaly", 2));
		students.add(new Student("Denis", 3));
		students.add(new Student("Sasha", 4));
		printStudents(students, 1);
	}
	
	
}
