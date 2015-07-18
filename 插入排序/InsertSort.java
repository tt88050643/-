public class InsertSort{
	public static void main(String[] args){
		long[] arr = {66, 11, 23, 0, 2, 31, 123, -11, -11, 0};
		for(int i=1; i<arr.length; i++){
			for(int j=i; j>0; j--){
				long tmp = arr[j];
				if(arr[j] > arr[j-1]) break;
				else{
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);	
		}
		
			
		
	}
}