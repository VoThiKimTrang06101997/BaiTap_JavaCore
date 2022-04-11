package baitap_javacore;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		/* nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác vuông có độ dài tương ứng
		 * Ex: n = 4 
		 * 		1 
		 * 		1 2 
		 * 		1 2 3 
		 * 		1 2 3 4
		 * */
	Scanner scan = new Scanner(System.in);
	int number;
	
	System.out.println("Nhập vào số tự nhiên n: ");
	number = Integer.parseInt(scan.nextLine());
	
	drawRightTriangle(number);
	}
	
	public static void drawRightTriangle(int number) {
		String str = "";
		for(int j=1; j<=number; j++) {
			str += j+ " ";
			System.out.println(str);
		}
	}
}

