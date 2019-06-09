package generalquestions;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int num = n;
		int k = 0;
		int m = 0;
		int sum = 0;
		while (n != 0) {
			k = n % 10;
			m = k * k * k;
			sum = sum + m;
			n = n / 10;
		}

		if (sum == num) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
