package arrays;

public class CompressString {
	
	public static boolean isCompress(String s) {
		char prev;
		int count;
		int flen = 0;
		prev = s.charAt(0);
		count = 1;
		for(int i =1; i< s.length();i++){
			if(prev == s.charAt(i)) {
				count++;
			} else {
				flen = flen + 1 + Integer.toString(count).length();
				prev = s.charAt(i);
				count = 1;
			}
		}
		flen = flen + 1 + Integer.toString(count).length();
		System.out.println("flen:"+flen);
		if(flen >= s.length()) {
			return false;
		}
		return true;
	}
	
	public static String compress(String s) {
		char prev;
		int count;
		int flen = 0;
		prev = s.charAt(0);
		count = 1;
		StringBuilder cs = new StringBuilder();
		for(int i =1; i< s.length();i++){
			if(prev == s.charAt(i)) {
				count++;
			} else {
				cs.append(prev);
				cs.append(Integer.toString(count));
				prev = s.charAt(i);
				count = 1;
			}
		}
		cs.append(prev);
		cs.append(Integer.toString(count));
		return cs.toString();
	}

	public static void main(String[] args) {
		String s = "aaaaaaaaaabbccddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
		boolean flag = isCompress(s);
		String  compressString;
		if(flag) {
			compressString = compress(s);
		} else {
			compressString = s;
		}
		System.out.println("compressString:"+compressString);

	}

}
