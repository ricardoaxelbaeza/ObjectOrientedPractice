package genericinterface;

public class OrderedPair<T> implements Pairable<T>{

	private T first,second;
	
	public OrderedPair(T first, T second) {
		this.first = first; 
		this.second = second; 
	}
	
	
	@Override
	public T getFirst() {		// TODO Auto-generated method stub
		return first;
	}

	@Override
	public T getSecond() {
		// TODO Auto-generated method stub
		return second;
	}

}
