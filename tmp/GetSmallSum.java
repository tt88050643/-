public class GetSmallSum{
	public static void main(String[] args){
		int[] arr = {1, 3, 5, 2, 4, 6, 5};
		if(arr.length == 0 || arr == null){
			System.out.println("no smallSum");
		}else{
			System.out.println(func(arr, 0, arr.length - 1));
		}
		//System.out.println(getSmallSum(arr));
	}
	// public static int getSmallSum(int[] arr){
		// if(arr.length == 0 || arr == null){
			// return 0;
		// }else{
			// return func(arr, 0, arr.length - 1);
		// }
	// }
	//计算小和数
	public static int func(int[] arr, int low, int high){
		if(low >= high) return 0;
		int mid = (low + high) / 2;
		return func(arr, low, mid) + func(arr, mid + 1, high) + merge(arr, low, high, mid);
	}
	public static int merge(int[] arr, int low, int high, int mid){
		int[] tmp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		int smallSum = 0;
		while(i <= mid && j <= high){
			if(arr[i] <= arr[j]){
				smallSum += arr[i] * (high - j + 1);
				tmp[k++] = arr[i++];
			} 
			else{
				tmp[k++] = arr[j++];
			} 
		}
		while(i <= mid){
			tmp[k++] = arr[i++];
		}
		while(j <= high){
			tmp[k++] = arr[j++];
		}
		for(int k1 = 0; k1 < tmp.length; k1++){
			arr[low + k1] = tmp[k1];
		}
		return smallSum;
	}
}