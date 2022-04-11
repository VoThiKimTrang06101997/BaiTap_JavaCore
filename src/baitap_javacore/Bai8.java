package baitap_javacore;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		/*
		 * Nhập vào 1 chuỗi viết thường và in ra chuỗi đã nhập với các ký tự đầu tiên
		 * được viết in hoa
		 */
		Scanner scan = new Scanner(System.in);
		String str = "";

		// Nhập chuỗi
		System.out.println("Nhập vào chuỗi kí tự: ");
		str = scan.nextLine();

		System.out.println("Chữ cái đầu viết hoa của chuỗi kí tự vừa nhập: " + "\n" + upcaseFirstLetter(str));

	}

	public static String upcaseFirstLetter(String str) {
		char[] input = str.toCharArray();

		input[0] -= 32;
		for (int i = 1; i < input.length; i++) {
			// Khoảng trắng và viết hoa chữ cái đầu tiên
			if (input[i] == 32) {
				i++;
				input[i] -= 32;
			}
		}
		return new String(input);
	}
}
