package baitap_javacore;

import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		/* nhập vào một chuỗi
		 * a) In ra độ dài của chuỗi.
		 * b) In ra ký tự (char) tại một vị trí nhất định (index).
		 * c) Kiểm tra xem, trong chuỗi vừa nhập có chuỗi phụ "abcdef" hay không ?
		 */
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.println("Nhập 1 chuỗi: ");
		str = input.nextLine();
		
		System.out.println("Độ dài của chuỗi: " + str.length() + "\n");
		System.out.println("Vị trí ký tự: ");
		
		int n = Integer.parseInt(input.nextLine());
		System.out.println("Ký tự tại vị trí " + n + " " + "là: " + str.charAt(n));
		System.out.println("Chuỗi vừa nhập có hay không chuỗi abcdef: " + str.contains("abcdef"));
		
	}
}
