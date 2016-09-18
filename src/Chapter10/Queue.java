package Chapter10;
/**
 * 数组实现队列的出队和入队
 * @author zgwang
 *
 */

public class Queue {
	private static int[] a = new int[10];
	private static int n = 0;
	public static void enQueue(int v){
		if(n < 10){
			a[n++] = v;
		}else{
			System.out.println("队列已满");
		}
	}
	public static int deQueue(){
		int v = a[0];
		if(n == 0){
			System.out.println("队列为空");
			return -1;
		}
		for(int i = 1; i < n; i++){
			a[i - 1] = a[i];
		}
		n--;
		return v;
				
	}
}
