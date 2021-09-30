package bridgeLabz;

public interface MyStack<E> {

	public Object push(Object o);
	public boolean isEmpty();
	public void pop();
	public E peek();
	public Object print();
	
	Object push(int data);
}
