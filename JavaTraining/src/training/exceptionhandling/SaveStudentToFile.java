package training.exceptionhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveStudentToFile {

	public void saveToFile(String studentAsString) throws MyCustomException {
		FileWriter myWriter = null;
		try {
			if (studentAsString.contains("Sambit")) {
				throw new MyCustomException("Some Exception Message Here");
			}
			File file = new File("MyStudent.txt");
			myWriter = new FileWriter(file);
			myWriter.write(studentAsString);
		} catch (IOException e) {
			System.out.println("IOException thrown in saveToFile method");
		} finally {
			if (myWriter != null) {
				try {
					myWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
