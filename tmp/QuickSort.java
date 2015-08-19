public class QuickSort{
	public static void main(String[] args){
		int[] arr = {3, 5, 12, 34, 1, 2, 3, 4, 3, 34};
		sort(arr, 0, arr.length - 1);
		for(int eachone : arr){
			System.out.println(eachone);
		}
		
	}
	
	public static void sort(int[] arr, int left, int right){
		if(left >= right) return;
		int fengP = partition(arr, left, right - 1, right);
		sort(arr, left, fengP - 1);
		sort(arr, fengP + 1, right);
	}
	
	public static int partition(int[] arr, int left, int right, int point){
		int tmpLeft = left;
		int tmpRight = right;
		int tmpVal = 0;
		while(tmpLeft <= tmpRight){
			while(tmpLeft <= tmpRight){
				if(arr[tmpLeft] > arr[point]) break;
				tmpLeft++;
			}
			while(tmpLeft <= tmpRight){
				if(arr[tmpRight] < arr[point]) break;
				tmpRight--;
			}
			if(tmpLeft <= tmpRight){
				tmpVal = arr[tmpLeft];
				arr[tmpLeft] = arr[tmpRight];
				arr[tmpRight] = tmpVal;
			}else{
				tmpVal = arr[tmpLeft];
				arr[tmpLeft] = arr[point];
				arr[point] = tmpVal;
			}
		}
		return tmpLeft;
	}
}