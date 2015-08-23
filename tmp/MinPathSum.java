public class MinPathSum{
	public static void main(String[] args){
		int[][] arr = {
						{1, 3, 5, 9},
						{8, 1, 3, 4},
						{5, 0, 6, 1},
						{8, 8, 4, 0}		
						};
		System.out.println(minPathSum(arr));
	}
	public static int minPathSum(int[][] arr){
		if(arr == null || arr.length == 0 || arr[0] == null || arr[0].length == 0){
			return 0;
		}
		int[][] pathSum = new int[arr.length][arr[0].length];
		pathSum[0][0] = arr[0][0];
		for(int i = 1; i < arr.length; i++){
			pathSum[i][0] = pathSum[i-1][0] + arr[i][0];
		}
		for(int i = 1; i < arr[0].length; i++){
			pathSum[0][i] = pathSum[0][i-1] + arr[0][i];
		}
		for(int i = 1; i < pathSum.length; i++){
			for(int j = 1; j < pathSum[0].length; j++){
				pathSum[i][j] = arr[i][j] + Math.min(pathSum[i-1][j], pathSum[i][j-1]);
			}
		}
		return pathSum[pathSum.length-1][pathSum[0].length-1];
	}
}