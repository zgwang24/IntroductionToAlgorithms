package Chapter10;
/**
 * ����ʵ�ֶ��еĳ��Ӻ����
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
			System.out.println("��������");
		}
	}
	public static int deQueue(){
		int v = a[0];
		if(n == 0){
			System.out.println("����Ϊ��");
			return -1;
		}
		for(int i = 1; i < n; i++){
			a[i - 1] = a[i];
		}
		n--;
		return v;
				
	}
}
