package Chapter6;
/**
 * 堆排序
 * @author zgwang
 *
 */
public class HeapSort {
	// 维护最大堆得性质：子树所包含的所有节点的值都不大于该子树根节点的值
	public static void maxHeapify(int[] a, int i, int n){
		// 左孩子
		int left = 2 * i + 1;
		// 右孩子
		int right = 2 * i + 2;
		
		int largest = -1;
		if(left < n && a[left] > a[i]){
			largest = left;
		}else{
			largest = i;
		}
		if(right < n && a[right] > a[largest]){
			largest = right;
		}
		if(largest != i){
			a[largest] = (a[largest] + a[i]) - (a[i] = a[largest]);
			maxHeapify(a, largest, n);
		}
	}
	// 构建一个最大堆
	public static void buildMaxHeap(int[] a){
		int n = a.length;
		for(int i = n / 2; i >= 0; i--){
			maxHeapify(a, i, n);
		}
	}
	// 堆排序
	public static void heapSort(int[] a){
		// 建堆
		buildMaxHeap(a);
		int n = a.length - 1;
		while(n > 0){
			a[0] = (a[0] + a[n]) - (a[n] = a[0]);
			maxHeapify(a, 0, n--);
		}
	}
	public static void main(String[] args) {
		int[] a = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
		heapSort(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

}
