package Chapter10;

public class StackDemo {
	public static void main(String[] args) {
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		Stack.push(4);
		Stack.push(5);
		Stack.push(6);
		Stack.push(7);
		Stack.push(8);
		Stack.push(9);
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		Stack.push(5);
		Stack.push(6);
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		
	}
}
