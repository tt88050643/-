public class MatrixPower{
	public static void main(String[] args){
		int[][] arr = {
						{1, 0, 0},
						{0, 0, 1},
						{1, 1, 1}
						};
		int[][] test = new int[arr.length][arr[0].length];
		test = matrixPower(arr, 10);
		for(int i = 0; i < test.length; i++){
			for(int j = 0; j < test[0].length; j++){
				System.out.print(test[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static int[][] matrixPower(int[][] arr, int p){
		int[][] result = new int[arr.length][arr[0].length];
		int[][] tmp = arr;
		for(int i = 0; i < arr.length; i++){
			result[i][i] = 1;
		}
		for(; p > 0; p = p>>1){
			if((p & 1) == 1){
				result = muliMatrix(result, tmp);
			}
			tmp = muliMatrix(tmp, tmp);
		}
		return result;
	}

	public static int[][] muliMatrix(int[][] arr1, int[][] arr2){
		int[][] result = new int[arr1.length][arr2[0].length];
		for(int i = 0; i < arr1.length; i++){
			for(int j = 0; j < arr2[0].length; j++){
				for(int k = 0; k < arr1[0].length; k++){
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		return result;
	}
}