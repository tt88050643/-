public class ShellSort{
	public static void sort(long[] arr){
		int h = 1;
		int k = 0;
		//先计算出最大插入排序的间隔
		while(h <= arr.length/3){
			h = h*3 + 1;
		}
		//先进行插入排序，最后减小间隔再进行下一轮插入排序
		while(h>0){
			for(int i=1; i+h <= arr.length; i++){
				long tmp = arr[i];
				for(k=i-1; k>=0; k--){
					if(arr[k] < tmp){
						break;
					}else{
						arr[k+1] = arr[k];
					}
				}
				arr[k+1] = tmp;
			}
			h=(h-1)/3;
		}
	}
}