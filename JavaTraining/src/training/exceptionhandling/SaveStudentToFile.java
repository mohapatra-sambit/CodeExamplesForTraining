package training.exceptionhandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
	
	public void saveToFile(MyStudent student) throws MyCustomException {
		ObjectOutputStream oos = null;
		try {
			File file = new File("MyStudentObject.ser");
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(student);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException thrown in saveToFile method");
			throw new MyCustomException(e.getMessage());
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
