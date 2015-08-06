public class ShellSort{
	public static void main(String[] args){
		int[] arr = {66, 11, 23, 0, 2, 31, 123, -11, -11, 0};
		int h = 1;
		while(h <= arr.length/3){
			h = h * 3 + 1;
		}
		while(h > 0){
			for(int i=h; i < arr.length; i++){
				for(int j=i-h; j>0; j=j-h){
					if(arr[i] >= arr[j]){
						break;
					}else{
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			h = (h -1) / 3;
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}