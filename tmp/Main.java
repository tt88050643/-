public class Main {

	private static int[] numbers = {88, 459, 5262, 88, -17, 677, 88, 677, -17, 459, 5262};
	public static void main(String[] args) throws Exception {
		int result = 0;
		for (int i = 0; i < numbers.length; ++i) {
			result ^= numbers[i];
		}
		System.out.println(result);
	}

}