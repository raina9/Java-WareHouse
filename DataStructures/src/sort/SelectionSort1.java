package sort;

import java.util.Scanner;

public class SelectionSort1 {

	public static int[] sort1(int array[], int size) {
		int iMin = 0;
		int temp = 0;
		for (int i = 0; i < size - 1; i++) {
			iMin = i;
			for (int j = i + 1; j < size; j++) {
				if (array[j] < array[iMin]) {
					iMin = j;
				}
			}
			temp = array[i];
			array[i] = array[iMin];
			array[iMin] = temp;
		}

		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter the random elements");
			array[i] = sc.nextInt();
		}
		int b[] = sort1(array, size);
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k]);
		}
	}

}
