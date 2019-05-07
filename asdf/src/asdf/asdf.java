package asdf;

public class asdf {
	public static void main(String[] args) {
		String str = "Java Secure coding";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c < 'Z') {
				c = (char) (c + 32);
			}
			System.out.println(c);;
		}
	}

}
