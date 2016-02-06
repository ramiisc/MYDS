package arrays;

public class RemoveDuplicates {

	public static void helper(int num[], int index) {
		while (index < num.length - 1) {
			num[index] = num[index + 1];
			index++;
		}
		num[index] = '\0';
		System.out.println("new length:" + num.length);
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
		System.out.println();

	}

	public static void removeDup2(int num[]) {
		int unique = 0;
		for (int i = 1; i < num.length; i++) {
			if(num[unique] != num[i]) {
				num[unique+1] = num[i];
				unique++;
			}
			i++;
		}
		unique++;
		System.out.println("unique:" + unique);
		while(unique <  num.length) {
			num[unique] = 0;
			unique++;
		}
		
		
	}

	public static void removeDup1(int num[]) {
		int i = 0;
		while (i < num.length - 1 && num[i] != '\0') {
			if (num[i] == num[i + 1]) {
				helper(num, i + 1);
			} else {
				i++;
			}
		}
	}

	public static void main(String args[]) {
		int[] num = { 1, 1, 2, 3, 3, 4, 5, 5, 5, 6 };
		System.out.println("original length:" + num.length);
		removeDup2(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}

	}

}
