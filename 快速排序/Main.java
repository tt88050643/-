public class Main{
	public static void main(String[] args){
		//int[] arr = new int[10];
		int[] arr = {3, 5, 12, 34, 1, 2, 3, 4, 3, 34};
		/*
		for(int i=0; i<10; i++){
			arr[i] = (int)(Math.random() * 99);
			System.out.println(arr[i]);
		}
		System.out.println("--------");
		*/
		QuickSort quicksort = new QuickSort();
		quicksort.sort(arr, 0, arr.length-1);
		for(int eachone : arr){
			System.out.println(eachone);
		}
		
	}
}