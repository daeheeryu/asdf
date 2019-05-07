package asdf;

public class Substring {
	public static void main(String args[]) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";

		int s_idx = 0;
		int e_idx = -1;
		System.out.println("출력결과");
		while(true) {
			e_idx = str.indexOf(" ", e_idx + 1);
			
			if(e_idx == -1) break;
			
			String s1 = str.substring(0 , e_idx);
			System.out.println(s1);
			
			//s_idx = e_idx;
			
		}

		
		/*
		int idx1 = str.indexOf(" ");
		String s1 = str.substring(0,idx1);
		
		int idx2 = str.indexOf(" ", idx1 + 1);
		String s2 = str.substring(idx1 + 1, idx2);
		
		System.out.println(s1);
		System.out.println(s2);
*/
	}
}