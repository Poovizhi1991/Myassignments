package Week1.day1;

public class Report {
	public static void main(String[] args) {
		// Print values of variables using object creation -Assignment 5
		
		Student printMark = new Student();
		System.out.println("Student Mark Details");
		System.out.println("--------------------");
		System.out.println("Name: "+printMark.studentName);
		System.out.println("Roll Number: "+printMark.rollNo);
		System.out.println("Collage Name: "+printMark.collageName);
		System.out.println("Mark Scored: "+printMark.markScored);
		System.out.println("CGPA: "+printMark.cgpa);
	}

}
