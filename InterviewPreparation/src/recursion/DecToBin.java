package recursion;

public class DecToBin {

	static String bin(int n) {
		String str = " ";
		if (n == 1)
			return str = "1";
		else
			str = str + bin(n / 2);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		String bin1 = bin(n);
		System.out.println(bin1);
	}

}
