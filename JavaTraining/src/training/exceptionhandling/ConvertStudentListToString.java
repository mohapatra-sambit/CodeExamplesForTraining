package training.exceptionhandling;

import java.util.List;

public class ConvertStudentListToString {
	
	public String convert(List<MyStudent> studentList) {
		StringBuffer buffer = new StringBuffer();
		if (!studentList.isEmpty()) {
			for(int i=0; i<studentList.size(); i++) {
				MyStudent myStudent = studentList.get(i);
				buffer.append(myStudent.toString());
			}
		}
		return buffer.toString();
	}

}
