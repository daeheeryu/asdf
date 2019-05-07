package collection;

public class Apple {

	public static void main(String[] args) {
		
		Box2<Apple> b = new Box2<Apple>();
		Apple a = new Apple();
		b.t = a;
		
		Box2<PineApple> b2 = new Box2<>();
	}
}
