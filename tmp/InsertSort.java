public class InsertSort{
	public static void main(String[] args){
		int[] arr = {66, 11, 23, 0, 2, 31, 123, -11, -11, 0};
		if(arr.length == 1){
			System.out.println(arr[0]);
			return;
		}
		int j = 0;
		for(int i=1; i<arr.length; i++){
			int tmp = arr[i];
			for(j=i-1; j>=0; j--){
				if(tmp <= arr[j]){
					arr[j+1] = arr[j];
				}else{
					break;
				}
			}
			arr[j+1] = tmp;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}