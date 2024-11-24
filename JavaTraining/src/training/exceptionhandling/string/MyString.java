package training.exceptionhandling.string;

public class MyString {
	
	public int length(String s) {
		int i = 0;
//		if (s.trim().equals("")) {
//			return 0;
//		}
		while(true) {
			try {
				s.charAt(i++);
			} catch (Exception e) {
//				e.printStackTrace();
				return i-1;
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "sambi!!!!!#$%^&hdeyytt1234";
//		System.out.println(s.length());
		System.out.println(new MyString().length(s));
	}

}
