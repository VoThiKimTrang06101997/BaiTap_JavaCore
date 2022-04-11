package baitap_javacore;

import java.util.Scanner;

public class TinhTienKaraoke {
	public static void main(String[] args) {
		int batDau = 0, ketThuc = 0, soLuongChaiNuoc = 0;
		// Nhập
		Scanner input_batdau = new Scanner(System.in);
		batDau = input_batdau.nextInt();
		System.out.print("Nhập giờ bắt đầu: " + batDau + "\n");

		Scanner input_ketthuc = new Scanner(System.in);
		ketThuc = input_ketthuc.nextInt();
		System.out.print("Nhập giờ kết thúc: " + ketThuc + "\n");

//		Scanner input_soluongchainuoc = new Scanner(System.in);
//		soLuongChaiNuoc = input_soluongchainuoc.nextInt();
//		System.out.print("Nhập số lượng chai nước: " + soLuongChaiNuoc + "\n");

		// Tính
//		int giaChaiNuoc = 10000;
		int tien = 0;
		int gio = (ketThuc - batDau);
		int thoiGian = (gio - 3);
		// thời gian nhỏ hơn 3
		if (gio < 3 && ketThuc >= 17) { // nếu số giờ nhỏ hơn 3 và nằm ngoài khoảng thời gian giảm giá
			tien = (gio * 30000);
		} else if (gio <= 3 && batDau >= 9
				&& ketThuc <= 17) { /*
									 * nếu số giờ nhỏ hơn 3 và thời gian nằm trong khoảng giảm giá
									 */
			tien = (gio * 30000) * (80 / 100);

			// thời gian lớn hơn 3
		} else if (gio > 3 && ketThuc >= 17) { /*
												 * nếu số giờ lớn hơn 3 và nằm ngoài khoảng thời gian giảm giá
												 */
			tien = (gio * 30000) + (thoiGian * 70 / 100);
		} else if (gio >= 3 && batDau >= 9
				&& ketThuc <= 17) { /*
									 * nếu số giờ lớn hơn 3 và nằm trong khoảng thời gian giảm giá
									 */
			tien = ((gio * 30000) + (thoiGian * 70 / 100)) * (90 / 100);
		}
		System.out.println("Số tiền khách cần phải trả là: " + tien + " " + "VNĐ");
	}
}
