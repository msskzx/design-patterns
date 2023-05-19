package de.tum.in.ase.pse;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

	private List<T> delegate;
	
	public MyStack() {
		delegate = new ArrayList<T>();
	}
	

    public void push(T element) {
        delegate.add(0, element);
    }

    public T pop() {
        return delegate.remove(0);
    }

    public T top() {
        return delegate.get(0);
    }
    
    public boolean isEmpty() {
    	return delegate.isEmpty();
    }

    public List<T> getDelegate() {
		return delegate;
	}


	public void setDelegate(List<T> delegate) {
		this.delegate = delegate;
	}


	public static void main(String[] argv) {
        MyStack<String> stack = new MyStack<>();

        System.out.println("Stack is " + (stack.isEmpty() ? "" : "not ") + "empty.");

        stack.push("First Element");
        stack.push("Second Element");
        stack.push("Third Element");

        System.out.println("This is the top element: " + stack.top());
        System.out.println("Stack is " + (stack.isEmpty() ? "" : "not ") + "empty.");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Stack is " + (stack.isEmpty() ? "" : "not ") + "empty.");
    }
}
