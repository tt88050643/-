public class missNum{
	public static void main(String[] args){
		int[] arr = {-10, -5, 9, 9, 2, 1, 4, 8, 6, 3};
		System.out.println(missNum(arr));
	}
	
	public static int missNum(int[] arr){
		int l = 0;
		int r = arr.length;
		while(l < r){
			if((l + 1) == arr[l]){
				l++;
			}else if(arr[l] <= l || arr[l] > r || arr[l] == arr[arr[l] - 1]){
				r--;
				arr[l] = arr[r];
			}else{
				int tmpVal = arr[arr[l] - 1];
				arr[arr[l] - 1] = arr[l];
				arr[l]  = tmpVal;
			}
		}
		return l + 1;
	}
}