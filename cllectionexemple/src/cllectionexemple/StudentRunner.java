package cllectionexemple;

import java.util.ArrayList;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StudentList student = new StudentList();
		 ArrayList<StudentClass> studentList = new ArrayList<>();
		 System.out.println(studentList.isEmpty());
		 studentList.add(new StudentClass("Abdou"));
		 studentList.add(new StudentClass("Ali"));
		 studentList.add(new StudentClass("Salif"));
		 studentList.add(new StudentClass("Fatou"));
		 studentList.add(new StudentClass("Sophie"));
		 System.out.println(studentList);
		 for(StudentClass student : studentList) {
			 	//student;
			 	System.out.println("My favotite student is: " +student);
		 }

	}

}
