package Chapter15;

public class LCS { 
	public static int[][] createOptArray(String str1, String str2){
		int strOneLen = str1.length();
		int strTwoLen = str2.length();
		int[][] opt = new int[strOneLen + 1][strTwoLen + 1];  
		
		for(int i = strOneLen - 1; i >= 0; i--){
			for(int j = strTwoLen - 1; j >= 0; j--){
				if(str1.charAt(i) == str2.charAt(j)){
					opt[i][j] = opt[i + 1][j + 1] + 1;
				}else{
					opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
				}
			}
		}
		return opt;
	} 
	public static void printLCS(int[][] opt, String str1, String str2){
		int i = 0;
		int j = 0;
		while(i < str1.length() && j < str2.length()){
			if(str1.charAt(i) == str2.charAt(j)){
				System.out.print(str1.charAt(i));
				i++;
				j++;
			}else if(opt[i + 1][j] >= opt[i][j = 1]){
				i++;
			}else{
				j++;
			}
		}
	}
	public static void main(String[] args){
		String str1 = "ABCBDAB";
		String str2 = "BDCABA";
		int[][] opt = createOptArray(str1, str2);
		for(int i = 0; i < opt.length; i++){
			for(int j = 0; j < opt[i].length; j++){
				System.out.print(opt[i][j] + " ");
			}
			System.out.println();
		}
		// printLCS(opt, str1, str2);
	}
}
