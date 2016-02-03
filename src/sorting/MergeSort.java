package sorting;

public class MergeSort {

	public static void merge(int a[], int l, int r) {
		int m = (l + r) / 2;
		int s1 = m -l+1, s2 = r - m;
		int i = 0, j = 0, k = l;
		int[] x = new int[s1];
		int[] y = new int[s2];

		while (i < s1) {
			x[i] = a[k];
			i++;
			k++;
		}

		k = m+1;

		while (j < s2) {
			y[j] = a[k];
			j++;
			k++;
		}
		i = 0;
		j = 0;
		k = l;
		while (i < s1 && j < s2) {
			if (x[i] < y[j]) {
				a[k] = x[i];
				i++;
				k++;
			} else {
				a[k] = y[j];
				j++;
				k++;
			}
		}

		while (i < s1) {
			a[k] = x[i];
			i++;
			k++;
		}

		while (j < s2) {
			a[k] = y[j];
			j++;
			k++;
		}

	}

	public static void mergeSort(int a[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, r);
			merge(a, l, r);
		}
	}

	public static void main(String args[]) {
		int a[] = { 4, 3, 5, 1, 7,2, 9};
		mergeSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
