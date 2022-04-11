package baitap_javacore;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		// Đề bài: Nhập vào số tự nhiên và In ra tổng các chữ số của số đó
		Scanner scan = new Scanner(System.in);
		int num;

		// Nhâp số
		System.out.println("Mời nhập số: ");
		num = Integer.parseInt(scan.nextLine());

		// Xuất tổng các chữ số
		System.out.println("Tổng các chữ số là: " + tinhTongCacChuSo(num));
	}

	private static int tinhTongCacChuSo(int num) {
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}
}
