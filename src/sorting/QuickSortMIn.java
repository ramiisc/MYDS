package sorting;

public class QuickSortMIn {
	public static void minPivot(int a[], int l, int r) {
		int min = l, i = l+1;
		int temp;
		while(i <= r) {
			if(a[i] < a[min]) {
				min = i;
			}
			i++;
		}
		temp = a[l];
		a[l] = a[min];
		a[min] = temp;
	}
	public static void quickSortMin(int a[], int l, int r) {
		if (l < r) {
			minPivot(a,l,r);
			quickSortMin(a, l+1, r);
		}
	}

	public static void main(String args[]) {
		int a[] = { 10, 4, 3, 5, 6, 7,2, 9,0,11,1};
		quickSortMin(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
