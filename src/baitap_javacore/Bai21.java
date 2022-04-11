package baitap_javacore;

import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		/* Kangaroo */
		Scanner input = new Scanner(System.in);
		int x1, x2, v1, v2;
		int soLanNhay;
		
		System.out.print("Địa chỉ của Kan1: ");
		x1 = Integer.parseInt(input.nextLine());
		System.out.print("Địa chỉ của Kan2: ");
		x2 = Integer.parseInt(input.nextLine());
		System.out.print("Vận tốc của Kan1: ");
		v1 = Integer.parseInt(input.nextLine());
		System.out.print("Vận tốc của Kan2: ");
		v2 = Integer.parseInt(input.nextLine());
		
		soLanNhay = (x1-x2)/(v2-v1);
		
		if(x1>=0 && x2>x1 && x2>0 && x1<=10000 && x2<=10000 && v1>=1 && v2>=1 && v1<=10000 && v2<=10000) {
			if ((x1-x2) % (v2-v1) == 0 && soLanNhay > 0) {
				System.out.println("Sau " + soLanNhay + " lần nhảy thì 2 con Kangaroo gặp nhau" );
			}
			else {
				System.out.println("2 con Kangaroo không gặp nhau");
			}
		}
		else {
			System.out.println("Các số đầu vào không thỏa mãn điều kiện");
		}
	}
}
