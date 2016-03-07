package arrays;

public class ReverseString {
	
	public static void reverse(char[] a) {
		int l = 0;
		int r = a.length - 1;
		char temp;
		while(l < r) {
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
		
	}

	public static void main(String[] args) {
		String s = "i am a great person";
		char[] buf = new char[s.length()];
		for(int i = 0; i < s.length();i++) {
			buf[i] = s.charAt(i);
		}
		reverse(buf);
		System.out.println("reverse:"+new String(buf));

	}

}
