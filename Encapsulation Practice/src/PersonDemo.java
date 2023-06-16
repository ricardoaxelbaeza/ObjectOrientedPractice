
public class PersonDemo {

	public static void main(String[] args) {
		
		Person a = new Person();
		
		a.setName("Tom");
		a.setAge(45);
		
		Person b = new Person();
		b.setName("Sally");
		b.setAge(23);
		
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
		System.out.println(b.getName());
		System.out.println(b.getAge());
		
		
		
	}

}
