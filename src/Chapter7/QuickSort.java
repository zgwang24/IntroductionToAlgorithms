package Chapter7;
/**
 * ¿ìËÙÅÅÐò
 * @author zgwang
 *
 */
public class QuickSort {
	public static void quickSort(int[] a, int lo, int hi){
		if(lo >= hi){
			return ;
		}
		int j = partition(a, lo, hi);
		quickSort(a, lo, j - 1);
		quickSort(a, j + 1, hi);
	}
	private static int partition(int[] a, int lo, int hi){
		int v = a[lo];
		int i = lo;
		int j = hi + 1;
		while(true){
			while(a[++i] < v){
				if(i == hi){
					break;
				}	
			}
			while(a[--j] > v){
				if(j == lo){
					break;
				}
			}
			if(i >= j){
				break;
			}
			a[i] = a[i] + a[j] - (a[j] = a[i]);					
		}
		a[lo] = a[lo] + a[j] - (a[j] = a[lo]);
		return j;
	}
	public static void main(String[] args) {
		int[] a = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
		quickSort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

}
