package baitap_javacore;

import java.util.Scanner;

public class Bai7 {
	public static void lietKeUocSo(int number) {
		System.out.println("Các ước số của " + number + ": ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		/* Nhập vào 1 số tự nhiên và In ra các ước số của số đó */
		Scanner scan = new Scanner(System.in);
		int number;

		// Nhập số
		System.out.println("Nhập số tự nhiên: ");
		number = Integer.parseInt(scan.nextLine());

		lietKeUocSo(number);
	}
}
