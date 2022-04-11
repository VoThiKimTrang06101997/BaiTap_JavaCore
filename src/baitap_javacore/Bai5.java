package baitap_javacore;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		/*
		 * Nhập tọa độ A, B Tính và xuất độ dài đoạn AB
		 */

		Scanner scan = new Scanner(System.in);
		float[] diemA = new float[2];
		float[] diemB = new float[2];

		// Nhập tọa độ điểm A
		diemA = nhapToaDo(scan, diemA, 'A');

		// nhập tọa độ điểm B
		diemB = nhapToaDo(scan, diemB, 'B');

		// tính và xuất độ dài đoạn AB
		System.out.println("Độ dài đoạn thẳng AB: " + tinhDoDai(diemA, diemB));

	}

	public static float[] nhapToaDo(Scanner scan, float[] diem, char chr) {
		System.out.println("Nhập tọa độ điểm " + chr + ": ");
		System.out.print("\tx: ");
		diem[0] = Float.parseFloat(scan.nextLine());
		System.out.print("\ty: ");
		diem[1] = Float.parseFloat(scan.nextLine());
		return diem;
	}

	public static float tinhDoDai(float[] diemA, float[] diemB) {
		return (float) Math
				.sqrt(Math.pow(Math.abs(diemA[0] - diemB[0]), 2) + Math.pow(Math.abs(diemA[1] - diemB[1]), 2));
	}
}
