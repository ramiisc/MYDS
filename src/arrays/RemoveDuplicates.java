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

	public static void helper2(int num[], int index, int count) {
		index  = index - count + 1;
		while (index < num.length - count && num[index] != '\0') {
			num[index] = num[index + count];
			index++;
		}
		int i = 0;
		while (i < count) {
			num[index - i] = '\0';
			i++;
		}
		

	}

	public static void removeDup2(int num[]) {
		int i = 0, count = 0;
		boolean found = false;
		while (i < num.length - 1 && num[i] != '\0') {
			if (num[i] == num[i + 1]) {
				found = true;
				count++;
				i++;
			} else if (found == true) {
				helper2(num, i, count);
				found = false;
				i = i - count + 1;
				count = 0;

			} else {
				i++;
			}
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
		int[] num = { 1, 2, 3, 3, 3, 4, 4, 5, 5, 6 };
		System.out.println("original length:" + num.length);
		removeDup2(num);
		System.out.println("new length:" + num.length);
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}

	}

}
