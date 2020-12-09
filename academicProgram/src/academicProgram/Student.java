package academicProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person implements Interface {
	
	private int nim, credit, totalCredit;
	private String courseName, lecturer, room;
	
	Scanner input = new Scanner(System.in);
	ArrayList<Student> course = new ArrayList<>();
	
	public Student() {
	}
	
	public Student(String courseName, int credit, String lecturer, String room) {
		super();
		this.courseName = courseName;
		this.credit = credit;
		this.lecturer = lecturer;
		this.room = room;
	}
	
	public int getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}

	public int getCredit() {
		return credit;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getLecturer() {
		return lecturer;
	}

	public String getRoom() {
		return room;
	}
	
	@Override
	public void studentRegistration() {
		System.out.println("### PRINT STUDENT DATA ###");
		
		if(getNim() != 0) {
			System.out.println("NIM         : " + getNim());
			
			if(totalCredit >= 144) {
				System.out.println("Full Name   : " + getFullName() + ", S.Kom");
			} else {
				System.out.println("Full Name   : " + getFullName());
			}
			
			System.out.println("Address     : " + getAddress());
			System.out.println("Credits     : " + totalCredit);
		} else {
			System.out.println("No Data");
		}
		
		System.out.println();
	}

	@Override
	public void learningPlan() {
		System.out.println("### PRINT STUDY PLAN ###");
		
		if(totalCredit != 0) {
			for (int i = 0; i < course.size(); i++) {
				System.out.println("\nCourse " + (i+1));
				System.out.println("Course Name : " + course.get(i).getCourseName());
				System.out.println("Credit      : " + course.get(i).getCredit());
				System.out.println("Lecturer    : " + course.get(i).getLecturer());
				System.out.println("Room        : " + course.get(i).getRoom());
			}
		} else {
			System.out.println("No Data");
		}
		
		System.out.println();
	}
	
	public void studentInput() {
		System.out.println("### INPUT STUDENT DATA ###");
        System.out.print("NIM         : ");
        setNim(input.nextInt());
        System.out.print("First Name  : ");
        setFname(input.next());
        System.out.print("Last Name   : ");
        setLname(input.next());
        System.out.print("Address     : ");
        setAddress(input.next());
		System.out.println();
	}
	
	public void courseInput() {
		System.out.println("### INPUT STUDY PLAN ###");
		System.out.print("Number of Courses : ");
        int countData = input.nextInt();
		
        for (int i = 0; i < countData; i++) {
        	System.out.println("\nCourse " + (i+1));
        	
        	System.out.print("Course Name : ");
            courseName = input.next();
            System.out.print("Credits     : ");
            credit = input.nextInt();
            System.out.print("Lecturer    : ");
            lecturer = input.next();
            System.out.print("Room        : ");
            room = input.next();
            
            course.add(new Student(courseName, credit, lecturer, room));
            totalCredit += course.get(i).getCredit();
		}

		System.out.println();
	}
	
}
