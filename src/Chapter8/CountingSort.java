package Chapter8;
/**
 * 计数排序
 * @author zgwang
 *
 */
public class CountingSort {
	public static int[] countingSort(int[] a){
		int max = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		max = max + 1;
		int[] c = new int[max];
		for(int i = 0; i < max; i++){
			c[i] = 0;
		}
		// 统计个数
		for(int i = 0; i < a.length; i++){
			c[a[i]] = c[a[i]] + 1; 
		}
		for(int i = 1; i < max; i++){
			c[i] = c[i] + c[i - 1]; 
		}
		int[] b = new int[a.length];
		for(int i = b.length - 1; i >= 0; i--){
			b[c[a[i]] - 1] = a[i];
			c[a[i]] = c[a[i]] - 1;
		}
		return b;
	}
	public static void main(String[] args) {
		int[] a = {2, 5, 3, 0, 2, 3, 0, 3};
		int[] b = countingSort(a);
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
	}
}
