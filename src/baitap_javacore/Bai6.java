package baitap_javacore;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		/* nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lại */
		Scanner scan = new Scanner(System.in);
		String str = "";

		// Cho phép người dùng nhập vào 1 chuỗi
		System.out.println("Nhập vào một chuỗi: ");
		str = scan.nextLine();

		// chuyển đổi chuỗi theo thứ tự ngược lại và in ra màn hình
		System.out.println("Chuỗi vừa mới được nhập được chuyển đổi theo thứ tự ngược lại là: " + reverseString(str));
	}

	public static String reverseString(String str) {
		char[] input = str.toCharArray();
		char temp;

		for (int i = 0, j = input.length - 1; i < j; i++, j--) {
//			System.out.println(input[i] + " : " + input[j]);
			temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
		return new String(input);
	}
}
