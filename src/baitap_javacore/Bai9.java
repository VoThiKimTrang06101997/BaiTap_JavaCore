package baitap_javacore;

import java.util.Random;
import java.util.Scanner;
import java.util.Spliterator;

public class Bai9 {
	public static boolean checkSameDigits(int numberA, int numberB) {
		int[] digitA = split(numberA);
		int[] digitB = split(numberB);

		for (int i : digitB) {
			for (int j : digitA) {
				if (i == j) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		/*
		 * nhập vào 2 số nguyên dương (từ 10 đến 99) in TRUE nếu 2 số trên có cùng một
		 * hoặc 2 chữ số, ngược lại in ra FALSE
		 */

		// Cách 1: Làm Random (Ngẫu nhiên).
		/*
		 * Random rand = new Random(); int numberA; int numberB; final int times = 50;
		 * 
		 * for(int i=0; i<=times; i++) { numberA = rand.nextInt(100); numberB =
		 * rand.nextInt(100); System.out.println(numberA + " " + "compare to " + numberB
		 * + ": " + checkSameDigits(numberA, numberB)); }
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào 2 số nguyên dương: ");
		int numberA = scan.nextInt();
		int numberB = scan.nextInt();

		final int times = 0;
		for (int i = 0; i <= times; i++) {
			System.out.println(numberA + " " + "compares to " + numberB + ": " + checkSameDigits(numberA, numberB));
		}

	}

	private static int[] split(int number) {
		int[] digit = new int[2];

		digit[0] = number / 10;
		digit[1] = number % 10;
		return digit;
	}

}
