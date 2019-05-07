package inheritance;

public class Main {
	public static void main(String[] args) {
		child1[] cc1 = new child1[2];
		child1 c1 = new child1();
		c1.b();
		cc1[0] = c1;
		
		parent p1 = new child1();
		p1.a();
		
		child1 c1 = new child1();
		c1.b();
		child1 c2 = new child2();
		c1.b();
	}
}