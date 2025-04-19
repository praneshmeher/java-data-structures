package stack;

import java.util.EmptyStackException;

public class StackClass {
	
	private int top;
	private int arr[];
	
	StackClass(int n){
		this.arr = new int[n];
		this.top = -1;
	}
	
	public int push(int n) {
		if(top<this.arr.length-1) {
			this.arr[++top]=n;
			return n;
		}else {
			throw new StackOverflowError();
		}
	}
	
	public int pop() {
		if(top<0) {
			throw new EmptyStackException();
		}else {
			return this.arr[top--];
		}
	}
	
	public int peek() {
		return this.arr[top];
	}
	
	public boolean isEmpty() {
		return this.arr.length == 0;
	}
	
	public static void main(String[] args) {
		
		StackClass stack = new StackClass(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
//		stack.push(40);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
	}

}
