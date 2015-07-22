public class ShellSort{
	public static void sort(long[] arr){
		int h = 1;
		//先计算出最大插入排序的间隔
		while(h < arr.length){
			h = h*3 + 1;
		}
		//先进行插入排序，最后减小间隔再进行下一轮插入排序
		for(; h>0; h=(h-1)/3){
			long tmp = 0;
			for(int i=1; (i+h)<=arr.length; i++){
				for(int k=i; k>0; k--){
					if(arr[k] > arr[k-1]){
						break;
					}else{
						tmp = arr[k];
						arr[k] = arr[k-1];
						arr[k-1] = tmp;
					}
				}
			}
		}
	}
}