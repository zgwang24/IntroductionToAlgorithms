package Chapter10;
/**
 * ����ʵ��ջ����ջ�ͳ�ջ
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
			System.out.println("ջ����");
		}
	}
	public static int pop(){
		if(n > 0){
			return a[--n];
		}else{
			System.out.println("ջΪ��");
			return -1;
		}
	}
}
