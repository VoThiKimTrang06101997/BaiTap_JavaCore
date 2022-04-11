package baitap_javacore;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		/* Kiểm tra xem năm nhập vào có phải năm nhuận hay không? */
		Scanner input = new Scanner(System.in);
		int year;
		System.out.println("Nhập năm: ");
		year = Integer.parseInt(input.nextLine());
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Đây là năm nhuận");
		} else {
			System.out.println("Đây không phải là năm nhuận");
		}
	}
}

