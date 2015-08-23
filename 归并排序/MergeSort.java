public class MergeSort{
	public static void main(String[] args){
		int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4};
		sort(nums, 0, nums.length - 1);
		for(int eachone : nums){
			System.out.println(eachone);
		}
	}
	public static void sort(int[] nums, int low, int high){
		if(low >= high) return;
		int mid = (low + high) / 2;
		sort(nums, low, mid);
		sort(nums, mid + 1, high);
		merge(nums, low, high, mid);
	}
	public static void merge(int[] nums, int low, int high, int mid){
		int[] tmp = new int[high - low + 1];
		int k = 0;
		int i = low;
		int j = mid + 1;
		while(i <= mid && j <= high){
			if(nums[i] <= nums[j]){
				tmp[k++] = nums[i++];
			}else{
				tmp[k++] = nums[j++];
			}
		}
		while(i <= mid){
			tmp[k++] = nums[i++];
		}
		while(j <= high){
			tmp[k++] = nums[j++];
		}
		for(int i2 = 0; i2 < tmp.length; i2++){
			nums[i2 + low] = tmp[i2];
		}
	}
}