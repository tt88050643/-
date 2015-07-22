public class Main{
	public static void main(String[] args){
		long[] arr = {99, 88, 77, 66, 55, 22, 1, 2, 3};
		ShellSort shellsort = new ShellSort();
		shellsort.sort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}