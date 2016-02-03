package sorting;

public class BubbleSort {
	public static void bubbleSort(int a[]) {
		int temp, n = a.length;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}

	}

	public static void main(String args[]) {
		int a[] = { 5, 3, 10, 1, 7 };
		bubbleSort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
