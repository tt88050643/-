public class SelectionSort{
	public static void main(String[] args){
		long[] arr = {66, 11, 23, 0, 2, 31, 123, -11};
		int lowest = 0;
		long tmp = 0;
		for(int i=0; i<=arr.length-1; i++){
			lowest = i;
			for(int j=i+1; j<=arr.length-1; j++){
				if(arr[j] < arr[lowest]){
					lowest = j;
				} 
			}
			tmp = arr[lowest];
			arr[lowest] = arr[i];
			arr[i] = tmp;
		}
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]);	
		}
	}
}