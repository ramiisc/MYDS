package sorting;

public class SelectionSort {
	
	public static void selectionSort(int a[]) {
		int temp, min , n;
		n = a.length;
		for(int i = 0; i < n - 1 ; i++) {
			min = i;
			for(int j = i+1; j < n-1; j++) {
				if(a[min] > a[j]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		
	}
	
	public static void main(String args[]) { 
	    int a[] = { 4, 3,5,1,7 };
	    selectionSort(a);
	    for(int i = 0; i < a.length; i++)
	    System.out.print(a[i]+" ");
	}

}
