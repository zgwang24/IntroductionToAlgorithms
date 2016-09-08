package Chapter9;

public class Max {
	public static int maxValue(int[] a){
		int max = a[0];
		for(int i= 1; i < a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {0, 1, 3, 4, 1, 8};
		int v = maxValue(a);
		System.out.println(v);
	}
}
