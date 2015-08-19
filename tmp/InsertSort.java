public class InsertSort{
	public static void main(String[] args){
		int[] arr = {3, 5, 12, 34, 1, 2, 3, 4, 3, 34};
		int j = 0;
		for(int i = 1; i < arr.length; i++){
			int tmpVal = arr[i];
			for(j = i - 1; j >= 0; j--){
				if(arr[j] > tmpVal){
					arr[j+1] = arr[j];
				}else break;
			}
			arr[j+1] = tmpVal;
		}
		
		for(int eachone : arr){
			System.out.println(eachone);
		}
	}
}