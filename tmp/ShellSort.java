public class ShellSort{
	public static void main(String[] args){
		int[] arr = {3, 5, 12, 34, 1, 2, 3, 4, 3, 34};
		int tmpVal = 0;
		int h = 0;
		int j = 0;
		while(h <= arr.length / 3){
			h = h * 3 + 1;
		}
		while(h > 0){
			for(int i = h; i + h < arr.length; i += h){
				tmpVal = arr[i];
				for(j = i - h; j >= 0; j -= h){
					if(tmpVal < arr[j]){
						arr[j+h] = arr[j];
					}else break;	
				}
				arr[j+h] = tmpVal;
			}
			
			h = (h - 1) / 3;
		}
	
		for(int eachone : arr){
			System.out.println(eachone);
		}
	
	}
}