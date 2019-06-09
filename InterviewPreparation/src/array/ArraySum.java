package array;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int brr[][] = { { 2, 4, 5 }, { 0, 8, 1 }, { 4, 5, 6 } };
		int crr[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr.length; j++) {
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
