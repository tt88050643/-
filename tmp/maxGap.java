public class maxGap{
	public static void main(String[] args){
		int[] arr = {9, 3, 1, 10, 12, -19, 21, 11};
		System.out.println(maxGap(arr));
	}
	
	public static int maxGap(int[] nums){
		if(nums == null || nums.length < 2){
			return 0;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int len = nums.length;
		for(int i = 0; i < len; i++){
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		if(min == max){
			return 0;
		}
		boolean[] hasNum = new boolean[len + 1];
		int[] mins = new int[len + 1];
		int[] maxs = new int[len + 1];
		int location = 0;
		for(int i = 0; i < len; i++){
			location = bucket(nums[i], min, max, len);
			mins[location] = hasNum[location] ? Math.min(mins[location], nums[i]) : nums[i];
			maxs[location] = hasNum[location] ? Math.max(maxs[location], nums[i]) : nums[i];
			hasNum[location] = true;
		}
		int result = 0;
		int lastMax = 0;
		int i = 0;
		for(i = 0; i <= len; i++){
			if(hasNum[i]){
				lastMax = maxs[i++];
				break;
			}
		}
		for(; i <= len; i++){
			if(hasNum[i]){
				result = Math.max(mins[i] - lastMax, result);
				lastMax = maxs[i];
			}
			
		}
		return result;
	}
	public static int bucket(long num, long min, long max, long len){
		return (int)(((num - min) * len) / (max - min));
	}
}