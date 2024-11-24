package training.exceptionhandling;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		MyStudent st = new MyStudent(1, "Aditya", 10, 'A');
		st.setScores(80, 75, 85, 70);
//		System.out.println(st);
		
		MyStudent st1 = new MyStudent(2, "Mayur", 11, 'C');
		st1.setScores(new Scores(85, 70, 88, 72));
//		System.out.println(st1);
		
		MyStudent st2 = new MyStudent(3, "Siddhant", 12, 'B');
		st2.setScores(new Scores(80, 71, 93, 82));
//		System.out.println(st2);
		
		MyStudent st3 = new MyStudent(4, "ABCD", 8, 'D');
		st2.setScores(new Scores(85, 76, 91, 80));
//		System.out.println(st2);

//		List<MyStudent> listOfStudents = new ArrayList<MyStudent>();
//		listOfStudents.add(st);
//		listOfStudents.add(st1);
//		listOfStudents.add(st2);
//		
//		
//		ConvertStudentListToString convertStudentListToString = new ConvertStudentListToString();
//		String convertedString = convertStudentListToString.convert(listOfStudents);
//		System.out.println(convertedString);
//		
//		new SaveStudentToFile().saveToFile(convertedString);
		
		MyStudentManager mgr = new MyStudentManager();
		mgr.addStudent(st);
		mgr.addStudent(st1);
		mgr.addStudent(st2);
		mgr.addStudent(st3);
		mgr.saveAllStudents();
	}

}
