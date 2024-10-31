package baitap2_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số lượng phần tử của mảng (n): ");
		int n = scanner.nextInt();
		int[] array = new int[n];

		// a. Hàm nhập và xuất mảng
		System.out.println("Nhập vào " + n + " phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử thứ " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		System.out.print("Mảng vừa nhập là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// b. Tìm số lớn nhất và vị trí của nó
		int max = array[0];
		int maxIndex = 0;
		for (int i = 1; i < n; i++) {
			if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		System.out.println("Số lớn nhất là " + max + " ở vị trí " + maxIndex);

		// c. Tìm số âm đầu tiên và vị trí của nó
		int firstNegative = -1;
		int firstNegativeIndex = -1;
		for (int i = 0; i < n; i++) {
			if (array[i] < 0) {
				firstNegative = array[i];
				firstNegativeIndex = i;
				break;
			}
		}
		if (firstNegativeIndex != -1) {
			System.out.println("Số âm đầu tiên là " + firstNegative + " ở vị trí " + firstNegativeIndex);
		} else {
			System.out.println("Không có số âm trong mảng.");
		}

		// d. Tìm số âm lớn nhất và vị trí của nó
		int maxNegative = Integer.MIN_VALUE;
		int maxNegativeIndex = -1;
		for (int i = 0; i < n; i++) {
			if (array[i] < 0 && array[i] > maxNegative) {
				maxNegative = array[i];
				maxNegativeIndex = i;
			}
		}
		if (maxNegativeIndex != -1) {
			System.out.println("Số âm lớn nhất là " + maxNegative + " ở vị trí " + maxNegativeIndex);
		} else {
			System.out.println("Không có số âm trong mảng.");
		}

		// e. Tính tổng các số chẵn
		int evenSum = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				evenSum += array[i];
			}
		}
		System.out.println("Tổng các số chẵn là: " + evenSum);

		// f. Đếm có bao nhiêu số âm
		int negativeCount = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] < 0) {
				negativeCount++;
			}
		}
		System.out.println("Có " + negativeCount + " số âm trong mảng.");

		// g. Tính tổng các số âm
		int negativeSum = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] < 0) {
				negativeSum += array[i];
			}
		}
		System.out.println("Tổng các số âm là: " + negativeSum);

		// h. Tìm x trong mảng
		System.out.print("Nhập vào số x cần tìm: ");
		int x = scanner.nextInt();
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (array[i] == x) {
				System.out.println("Tìm thấy x = " + x + " ở vị trí " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Không tìm thấy x trong mảng.");
		}

	}
}
