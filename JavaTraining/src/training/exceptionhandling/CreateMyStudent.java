package training.exceptionhandling;

import java.util.Scanner;

public class CreateMyStudent {
	
	public static void main(String[] args) {
//		char ans = 'y';
		Scanner scanner = new Scanner(System.in);
		MyStudent st = null;
		MyStudentManager mgr = new MyStudentManager();
//		do {
			System.out.println("Student Name: ");
			String name = scanner.next();
			System.out.println("Student Roll Number: ");
			int rollNo = scanner.nextInt();
			System.out.println("Student Class: ");
			int cls = scanner.nextInt();
			System.out.println("Student Section: ");
			String section = scanner.next();
			System.out.println("Maths Score: ");
			double mathsScore = scanner.nextDouble();
			System.out.println("Physics Score: ");
			double phyScore = scanner.nextDouble();
			System.out.println("Chemistry Score: ");
			double chemScore = scanner.nextDouble();
			System.out.println("English Score: ");
			double engScore = scanner.nextDouble();
			st = new MyStudent(rollNo, name, cls, section.charAt(0));
			st.setScores(mathsScore, phyScore, chemScore, engScore);
//			mgr.addStudent(st);
//			System.out.println("Add More?");
//			ans = scanner.next().charAt(0);
//		} while (ans == 'y' || ans == 'Y');
		try {
//			mgr.saveAllStudents();
			mgr.saveStudent(st);
		} catch (MyCustomException e) {
			e.printStackTrace();
			System.out.println("Unable to add Students");
		}
		scanner.close();
	}

}
