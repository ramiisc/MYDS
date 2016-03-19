package sorting;

public class MergeSortedArrays {

	public static void merge(int[] a, int[] b, int noA,int noB) {
		int newLength = noA+noB-1;
		int i = noA - 1, j = noB - 1;
		while (i >= 0 && j >= 0) {
			if (a[i] > b[j]) {
				a[newLength--] = a[i];
				i--;
			} else {
				a[newLength--] = b[j];
				j--;
			}
		}
		while (j >= 0) {
			a[newLength--] = b[j];
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = { 23, 24, 25, 56, 60 };
		int[] a = new int[b.length + 10];
		a[0] = 12;
		a[1] = 14;
		a[2] = 27;
		a[3] = 55;
		a[4] = 70;
		a[5] = 80;
		merge(a, b,6,5);
		
		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
		

	}

}
