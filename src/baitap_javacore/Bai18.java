package baitap_javacore;

import java.util.Scanner;

public class Bai18 {
	public static void main(String[] args) {
		/* Gửi tiền nhàn rỗi */
		Scanner input = new Scanner(System.in);
		
		double soTienBanDau;
		System.out.println("Số tiền ban đầu: ");
		soTienBanDau = Integer.parseInt(input.nextLine());
		
		double soTienMuonCo;
		System.out.println("Số tiền muốn có: ");
		soTienMuonCo = Integer.parseInt(input.nextLine());
		
		double laiSuat = 0.1;  // 10% 1 năm
		int soNam;
		
		soNam = (int) ((soTienMuonCo - soTienBanDau)/(soTienBanDau*laiSuat));
		
		System.out.println("Số năm tối thiểu phải chờ: " + soNam + " năm");
	}
}
