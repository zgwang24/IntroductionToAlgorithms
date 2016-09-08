package Chapter9;

public class MinAndMax {
	public static int[] minAndMax(int[] a){
		int max = a[0];
		int min = a[0];
		int[] r = new int[2];
		for(int i = 1; i < a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
			if(min > a[i]){
				min = a[i];
			}
		}
		r[0] = min;
		r[1] = max;
		return r;
	}
	public static void main(String[] args) {
		int[] a = {0, 1, 3, 4, 1, 8};
		int[] v = minAndMax(a);
		System.out.println("Min: " + v[0] + ", Max: " + v[1]);
	}
}
