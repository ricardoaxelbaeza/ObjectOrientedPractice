package animal;

public class AnimalDemo {

	public static void main(String[] args) {

		Dog doggo = new Dog();
		Cat kitty = new Cat();
		CareTaker john = new CareTaker();
	
		System.out.println("Who let the dogs out? ");
		doggo.says();
		
		System.out.println("Cat:");
		kitty.says();
		
		john.theyFrusturated();
		
		
	}

}
