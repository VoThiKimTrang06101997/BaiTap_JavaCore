package baitap_javacore;

import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		/* Tách một mảng số tự nhiên được nhập từ bàn phím thành 2 mảng: một mảng chẵn + một mảng lẻ*/
		Scanner input = new Scanner(System.in);
		int n;
		int mangChan, mangLe;
		
		System.out.print("Bạn nhập bao nhiêu số tự nhiên? ");
		n = Integer.parseInt(input.nextLine());
		
		int[] soTuNhien = new int[n];
		int[] soChan = new int[n];
		int[] soLe = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Số thứ " + i + ": ");
			soTuNhien[i] = Integer.parseInt(input.nextLine());
		}
		
		mangChan = mangLe = 0;
		for(int i=0; i<n; i++) {
			if(soTuNhien[i] % 2 == 0) {
				soChan[mangChan] = soTuNhien[i];
				mangChan++;
			} else {
				soLe[mangLe] = soTuNhien[i];
				mangLe++;
			}
		}
		System.out.println("Mảng số chẵn: ");
		for(int i=0; i<mangChan; i++) {
			System.out.print(soChan[i] + " ");
		}
		System.out.println("\nMảng số lẻ: ");
		for(int i=0; i<mangLe; i++) {
			System.out.print(soLe[i] + " ");
		}
	}
}
