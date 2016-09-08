package Chapter4;
/**
 * 矩阵相乘
 * @author zgwang
 *
 */
public class SquareMatrixMultiply {
	// 直接相乘
	public static int[][] squareMatrixMultiply1(int[][] a, int[][] b){
		int[][] c = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b[i].length; j++){
				c[i][j] = 0;
				for(int k = 0; k < a[0].length; k++){
					c[i][j] += a[i][k] * a[k][j];
				}
			}
		}
		return c;
	}
	// 分治策略
	/*public static int[][] squareMatrixMultiply2(int[][] a, int[][] b){
		int n = a.length;
		int [][] c = new int[n][n];
		if(n == 1){
			c[0][0] = a[0][0] * b[0][0];
		}else{
			c[0][0] = squareMatrixMultiply2(a[0][0], b[0][0]) 
					+ squareMatrixMultiply2(a[0][1], b[1][0]);
			c[0][1] = squareMatrixMultiply2(a[0][0], b[0][1]) 
					+ squareMatrixMultiply2(a[0][1], b[1][1]);
			c[1][0] = squareMatrixMultiply2(a[1][0], b[0][0]) 
					+ squareMatrixMultiply2(a[1][1], b[1][0]);
			c[1][1] = squareMatrixMultiply2(a[1][0], b[0][1]) 
					+ squareMatrixMultiply2(a[1][1], b[1][1]);
		}
		return c;
	}*/
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] b = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] c = squareMatrixMultiply1(a, b);
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[0].length; j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
