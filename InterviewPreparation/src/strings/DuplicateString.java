package strings;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shivendra mohan raina";
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			count = 0;
			char ch = str.charAt(i);
			for (int j = 0; j < len - 1; j++) {
				char ch1 = str.charAt(j);
				if (ch == ch1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
