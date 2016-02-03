package sorting;

public class QuickSortMedian {
	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void median(int a[], int l, int r) {
		
		int mid = (l+r)/2;
		if(a[l] > a[mid]) {
			swap(a,l,mid);
		}
		if(a[l] > a[r]) {
			swap(a,l,r);
		}
		if(a[mid] > a[r]) {
			swap(a,mid,r);
		}
		swap(a,mid,r);
		
	}

	public static int pivot(int a[], int l, int r) {
		int p = l, i = l;
		int element = a[r],temp;
		while(i < r) {
			if(a[i] < element) {
				temp = a[i];
				a[i] = a[p];
				a[p] = temp;
				p++;
			}
			i++;
		}
		a[r] = a[p];
		a[p] = element;
		return p;
	}
	public static void quickSort(int a[], int l, int r) {
		if (l < r) {
			int p = pivot(a,l,r);
			quickSort(a, l, p-1);
			quickSort(a, p+1, r);
		}
	}

	public static void main(String args[]) {
		int a[] = { 10, 4,12, 3, 5, 1, 7,2,0};
		quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
