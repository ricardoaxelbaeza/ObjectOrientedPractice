
public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("I like to eat wet food");
	}

	@Override
	public void walk() {
		System.out.println("I barely walk, I just lay on the couch all day");
		
	}

	@Override
	public void sleep() {
		System.out.println("When I'm not eating, I am sleeping");
		
	}

}
