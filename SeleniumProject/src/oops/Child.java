package oops;

public class Child extends Parent {

	public void bike() {
		System.out.println("bike method from child class");
	}

	public static void main(String[] args) {

		Child c = new Child();

		c.bike();
		c.car();
		c.farm();
		c.home();
		c.money();
	}

	@Override
	public void home() {

		System.out.println("home method from child class");

	}

	@Override
	public void car() {
		System.out.println("car method from child class");

	}

	@Override
	public void farm() {
		System.out.println("farm method from child class");

	}

	@Override
	public void money() {
		System.out.println("money  method from child class");

	}
}
