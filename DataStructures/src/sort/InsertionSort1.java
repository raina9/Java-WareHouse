package sort;

import java.util.Scanner;

public class InsertionSort1 {
	public static int[] Insert(int a[], int s) {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int array[] = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the random elements");
			array[i] = sc.nextInt();
		}
		System.out.println("array before sorting");
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println();
		int b[] = Insert(array, size);

		System.out.println("array after sorting");
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k] + " ");
		}

	}

}
