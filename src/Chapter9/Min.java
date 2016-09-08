package Chapter9;

public class Min {
	public static int minValue(int[] a){
		int min = a[0];
		for(int i= 1; i < a.length; i++){
			if(min > a[i]){
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] a = {0, 1, 3, 4, 1, 8};
		int v = minValue(a);
		System.out.println(v);
	}
}
