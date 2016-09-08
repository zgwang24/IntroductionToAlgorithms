package Chapter6;
/**
 * ������
 * @author zgwang
 *
 */
public class HeapSort {
	// ά�����ѵ����ʣ����������������нڵ��ֵ�������ڸ��������ڵ��ֵ
	public static void maxHeapify(int[] a, int i, int n){
		// ����
		int left = 2 * i + 1;
		// �Һ���
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
	// ����һ������
	public static void buildMaxHeap(int[] a){
		int n = a.length;
		for(int i = n / 2; i >= 0; i--){
			maxHeapify(a, i, n);
		}
	}
	// ������
	public static void heapSort(int[] a){
		// ����
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
