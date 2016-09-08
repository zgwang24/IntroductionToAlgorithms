package Chapter4;

/**
 * 分治策略求解最大子数组问题
 * @author zgwang
 *
 */
public class FindMaxSubArray {

	public static int findMaxSubArray(int[] a, int lo, int hi){
		if(lo == hi){
			return a[lo];
		}else{
			int mid = (lo + hi) / 2;
			int res1 = findMaxSubArray(a, lo, mid);
			int res2 = findMaxSubArray(a, mid + 1, hi);
			int res3 = findMaxCrossingSubArray(a, lo, mid, hi);
			if(res1 >= res2 && res1 >= res3){
				return res1;
			}else if(res2 >= res1 && res2 >= res3){
				return res2;
			}else{
				return res3;
			}
		}	
	}
	private static int findMaxCrossingSubArray(int[] a, int lo, int mid, int hi){
		int leftMaxSum = Integer.MIN_VALUE;
		int leftSum = 0;
		for(int i = mid; i >= lo; i--){
			leftSum = leftSum + a[i];
			if(leftSum > leftMaxSum){
				leftMaxSum = leftSum;
			}
		}
		
		int rightMaxSum = Integer.MIN_VALUE;
		int rightSum = 0;
		for(int i = mid + 1; i <= hi; i ++){
			rightSum = rightSum + a[i];
			if(rightSum > rightMaxSum){
				rightMaxSum = rightSum;
			}
		}
		return leftMaxSum + rightMaxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0, 34, -90, 45};
		System.out.println(findMaxSubArray(a, 0, a.length - 1));
		
	}

}
