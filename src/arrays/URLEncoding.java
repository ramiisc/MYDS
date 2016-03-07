package arrays;

public class URLEncoding {

	public static String encode1(String s) {

		int count = 0;
		int k = 0;
		char temp;
		char[] a;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		a = new char[s.length() + count * 2];
		int i = 0;
		while (i < s.length() - 1) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				a[k++] = '%';
				a[k++] = '2';
				a[k++] = '0';
			}
			if (s.charAt(i) != ' ') {
				a[k] = s.charAt(i);
				++k;
			}
			i++;
		}
		if (s.charAt(i) != ' ')
			a[k] = s.charAt(i);
		return new String(a, 0, k + 1);
	}

	public static void encode2(char[] a, int length) {

		int count = 0;
		int newLength;
		for (int i = 0; i < length; i++) {
			if (a[i] == ' ') {
				count++;
			}
		}
		newLength = length + count * 2;
		a[newLength--] = '\0';
		for (int i = length - 1; i >= 0; i--) {
			if (a[i] == ' ') {
				a[newLength--] = '0';
				a[newLength--] = '2';
				a[newLength--] = '%';
			} else {
				a[newLength--] = a[i];
			}
		}

	}

	public static void main(String args[]) {
		String s = "     add  ";
		String es = encode1(s);
		char[] str = new char[s.length() + s.length() * 2+1];
		for (int i = 0; i < s.length(); i++) {
			str[i] = s.charAt(i);
		}
		encode2(str, s.length());
		System.out.println("es:" + new String(str)+ "end");

	}

}
