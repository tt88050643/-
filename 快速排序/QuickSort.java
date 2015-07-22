public class QuickSort{
	int left = 0;
	int right = 0;
	
	private int fenge(int[] arr, int left, int right, int point){
		int tmpLeft = left;
		int tmpRight = right;
		while(tmpLeft <= tmpRight){
			for(; tmpLeft<=tmpRight; tmpLeft++){
				if(arr[tmpLeft] >= arr[point]) break;
			}
			for(; tmpRight>=tmpLeft; tmpRight--){
				if(arr[tmpRight] <= arr[point]) break;
			}
			if(tmpLeft <= tmpRight){
				int tmp = arr[tmpLeft];
				arr[tmpLeft] = arr[tmpRight];
				arr[tmpRight] = tmp;
			}else{
				int tmp1 = arr[tmpLeft];
				arr[tmpLeft] = arr[point];
				arr[point] = tmp1;
			}
		}
		return tmpLeft;
	}
	
	public void sort(int[] arr, int left, int right){
		if(right <= left) return;
		else{
			int point = right;
			int fengeP = fenge(arr, left, right-1, point);
			sort(arr, left, fengeP-1);
			sort(arr, fengeP+1, right);	
		}
		
	}
}