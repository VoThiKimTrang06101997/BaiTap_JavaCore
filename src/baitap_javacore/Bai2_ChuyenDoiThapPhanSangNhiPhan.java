package baitap_javacore;

import java.util.Scanner;

public class Bai2_ChuyenDoiThapPhanSangNhiPhan {
	public static void main(String[] args) {
		Scanner input_number = new Scanner(System.in);
		System.out.println("Nhập số: ");
		int soChuyenDoi = input_number.nextInt();

		System.out.print("Giá trị nhị phân của số " + soChuyenDoi + " " + " đã chuyển đổi là: ");

		System.out.println(Integer.toBinaryString(soChuyenDoi));

	}
}
