
public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("I love bacon");
		
	}

	@Override
	public void walk() {
		System.out.println("Did someone say walk?!");
	}

	@Override
	public void sleep() {
		System.out.println("Ahhhh time for bed");
	}

}
