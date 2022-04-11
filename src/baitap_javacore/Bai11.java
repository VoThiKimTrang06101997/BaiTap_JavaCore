package baitap_javacore;

import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		/* nhập vào số tự nhiên n, in ra số tự nhiên lớn nhất nhỏ hơn log2(n) */
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.println("Nhập vào số tự nhiên: ");
		number = Integer.parseInt(scan.nextLine());
		
		System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(" + number + "): " + findLargestUnderLog2n(number));
	}
	
	public static int findLargestUnderLog2n(int number) {
		return (int) (Math.log(number) / Math.log(2));
	}
}
