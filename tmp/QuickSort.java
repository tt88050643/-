public class QuickSort{
	public static void main(String[] args){
		int[] arr = {3, 5, 12, 34, 1, 2, 2};
		sort(arr, 0, arr.length - 1);
		for(int eachone : arr){
			System.out.println(eachone);
		}
	}
	
	public static void sort(int[] arr, int left, int right){
		if(left >= right) return;
		else{
			int point = right;
			int fengeP = 0;
			fengeP = fenge(arr, left, point - 1, point);
			sort(arr, left, fengeP - 1);
			sort(arr, fengeP + 1, right);
		}
		
	}
	
	public static int fenge(int[] arr, int left, int right, int point){
		int leftTmp = left;
		int rightTmp = right;
		int tmpVal = 0;
		while(leftTmp < rightTmp){
			while(leftTmp <= rightTmp){
				if(arr[leftTmp] >= arr[point]) break;
				leftTmp++;
			}
			while(leftTmp <= rightTmp){
				if(arr[rightTmp] <= arr[point]) break;
				rightTmp--;
			}
			
			if(leftTmp <= rightTmp){
				tmpVal = arr[leftTmp];
				arr[leftTmp] = arr[rightTmp];
				arr[rightTmp] = tmpVal;
			}else{
				tmpVal = arr[leftTmp];
				arr[leftTmp] = arr[point];
				arr[point] = tmpVal;
			}
		}
		return leftTmp;
	}
}