package baitap_javacore;

import java.util.Random;
import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		/* Cho phép máy tính phát sinh ngẫu nhiên một số từ 1 đến 1000.
		 * Người dùng sẽ đoán và nhập, nếu đúng với kết quả của máy, game sẽ dừng. 
		   Ngược lại máy sẽ báo bạn đang nhập một số lớn hơn hoặc nhỏ hơn số bí mật
		 */
		Scanner input = new Scanner(System.in);
		
		int soBanDoan;
		
		do {
			System.out.println("Số bạn đoán: ");
			soBanDoan = Integer.parseInt(input.nextLine());
			
			int soNgauNhien;
			Random random = new Random();
			
			soNgauNhien = random.nextInt(1000) + 1;
			System.out.println("Số ngẫu nhiên: " + soNgauNhien);
			
			if(soBanDoan == soNgauNhien) {
				System.out.println("Số bạn đoán bằng số ngẫu nhiên");
			}
			if(soBanDoan < soNgauNhien) {
				System.out.println("Số bạn đoán nhỏ hơn số ngẫu nhiên");
			}
			if(soBanDoan > soNgauNhien) {
				System.out.println("Số bạn đoán lớn hơn số ngẫu nhiên");
			}
		} while (true);
	}
	
}
