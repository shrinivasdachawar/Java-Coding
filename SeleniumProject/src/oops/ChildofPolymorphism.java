package oops;

public class ChildofPolymorphism extends Polymorphism {

	public static void main(String[] args) {

		ChildofPolymorphism c1 = new ChildofPolymorphism();
		c1.demo();
		c1.m1();
		c1.test();

	}

	@Override
	public void demo() {
		System.out.println("demo method from child class");
	}

	@Override
	public void test() {
		System.out.println("test method from child class");
	}

	@Override
	public void m1() {
		System.out.println("m1 method from child class");
	}

}
