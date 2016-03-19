package sorting;

public class SearchRotatedSorted {

	public static int find(int[] a, int l, int r, int n) {

		int m = (l + r) / 2;
		if (a[m] == n)
			return m;
		else if (r < l)
			return -1;
		else if (a[l] < a[m]) {
			if (a[l] <= n && n < a[m]) {
				return find(a, l, m - 1, n);
			} else {
				return find(a, m + 1, r, n);
			}
		} else if (a[m] < a[r]) {
			if (a[m] < n && n <= a[r]) {
				return find(a, m + 1, r, n);
			} else {
				return find(a, l, m - 1, n);
			}
		} else {
			int result;
			if ((result = find(a, l, m - 1, n)) != -1)
				return result;
			else
				return find(a, m + 1, r, n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 70, 60, 50, 20, 30, 40 };

		System.out.println("Found at" + find(a, 0, a.length - 1, 60));

	}

}
