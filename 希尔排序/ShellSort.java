public class ShellSort{
	public static void sort(long[] arr){
		int h = 1;
		int k = 0;
		//�ȼ��������������ļ��
		while(h <= arr.length/3){
			h = h*3 + 1;
		}
		//�Ƚ��в�����������С����ٽ�����һ�ֲ�������
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