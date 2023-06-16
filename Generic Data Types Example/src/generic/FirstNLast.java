package generic;

public class FirstNLast <T> {
	
	private T first;
	private T last; 
	
	
	public FirstNLast(T first, T last) {

	this.first = first;
	this.last = last;
	
	}

	
	public T getFirst() {
		return first;
	}
	
	public T getLast() {
		return last;
	}
	
	
	
	

}
