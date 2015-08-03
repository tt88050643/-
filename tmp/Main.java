import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int c = -1;
		System.out.println(Integer.toBinaryString(c));
		c = c >> 1;
		System.out.println(Integer.toBinaryString(c));
		c = c >> 1;
		System.out.println(Integer.toBinaryString(c));
		c = c >> 1;
		System.out.println(Integer.toBinaryString(c));
		int a = 0xff000000;
		System.out.println(Integer.toBinaryString(a));
		a = a >> 1;
		System.out.println(Integer.toBinaryString(a));
		a = a >>> 1;
		System.out.println(Integer.toBinaryString(a));
	}
}