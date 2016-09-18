package Chapter10;
/**
 * 数组实现栈的入栈和出栈
 * @author zgwang
 *
 */
public class Stack {
	private static int[] a = new int[10];
	private static int n = 0;
	public static void push(int v){
		if(n < 10){
			a[n++] = v;
		}else{
			System.out.println("栈已满");
		}
	}
	public static int pop(){
		if(n > 0){
			return a[--n];
		}else{
			System.out.println("栈为空");
			return -1;
		}
	}
}
