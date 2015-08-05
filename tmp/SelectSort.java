public class SelectSort{
	public static void main(String[] args){
		long[] arr = {1, 6, 2, 8, 3, 78, 0};
		int tmp = 0;
		for(int i=0; i<arr.length; i++){
			tmp = 0;
			for(int j=0; j<arr.length-i; j++){
				if(arr[tmp] < arr[j]){
					tmp = j;
				}
			}
			long tmptmp = arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[tmp];
			arr[tmp] = tmptmp;
			
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}		
	}
}