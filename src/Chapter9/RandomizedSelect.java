package Chapter9;

public class RandomizedSelect {
	public static int RandomizedSelect(int[] a, int lo, int hi, int i){
		if(i > a.length || i < 0){
			return Integer.MAX_VALUE;
		}
		if(lo == hi){
			return a[hi];
		}
		int j = partition(a, lo, hi);
		int k = j - lo + 1;
		if(i == k){
			return a[j];
		}else if(i < k){
			return RandomizedSelect(a, lo, j - 1, i);
		}else{
			return RandomizedSelect(a, j + 1, hi, i - k);
		}
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
		int[] a = {0, 1, 3, 4, 1, 8};
		int v = RandomizedSelect(a, 0, a.length - 1, 6);
		System.out.println(v);
	}

}
