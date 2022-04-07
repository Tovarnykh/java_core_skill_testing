package Collections_and_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

class Programm {
	
		static class Student{
		String name;
		int course;
		Student(String name, int course){
			this.name = name;
			this.course = course;
		}
		
		public String getName() {
			return name;
		}
		
		public int getCourse() {
			return course;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (name != other.name)
				return false;
			if (course != other.course)
				return false;
			return true;
		}
		
		@Override
	    public int hashCode() {
	        int result = 17;
	        result = 31 * result + name.hashCode();
	        result = 31 * result + course;
	        return result;
	    }
		
	}
	
	 static void printStudents(List<Student> students, int course) {
		ListIterator<Student> students_iter = students.listIterator();
		while(students_iter.hasNext()) {
			if(students_iter.next().getCourse() == course)
				System.out.println(students_iter.next().getName());
		}
	}
	
	static void printCollection(Collection collection) {
        for(Object element : collection)
            System.out.print(element + " ");
        System.out.println();
    }
	
	static Set<Student> union(Set<Student> set1, Set<Student> set2){
		set1.addAll(set2);
		return set1;
	}

	static Set<Student> intersect(Set<Student> set1, Set<Student> set2){
		set1.retainAll(set2);
		return set1;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Jacob", 1));
		students.add(new Student("Nastya", 2));
		students.add(new Student("Viktor", 3));
		students.add(new Student("Yuly", 1));
		students.add(new Student("Vitaly", 2));
		students.add(new Student("Viktor", 3));
		students.add(new Student("Sasha", 4));
		students.add(new Student("Sasha", 4));
		students.add(new Student("Nicolas", 4));
//-------------------------------------
		HashSet<Student> students_set = new HashSet<Student>();
		HashSet<Student> students_set2 = new HashSet<Student>();
		students_set.addAll(students);
		students_set2.add(new Student("Bernard",1));
		students_set2.add(new Student("Lily",2));
		students_set2.add(new Student("Olaf",3));
		students_set2.add(new Student("Nicolas",4));
		students_set2.add(new Student("Yuly",1));
		students_set2.add(new Student("Sasha",1));
		
		for(Student p: intersect(students_set,students_set2)) {
			System.out.println(p.getName()+" "+p.getCourse());
		}
	}
	
	
}
