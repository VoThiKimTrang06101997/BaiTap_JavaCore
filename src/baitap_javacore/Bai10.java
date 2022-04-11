package baitap_javacore;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		/* nhập vào số tự nhiên n, in ra tổng các số nguyên tố từ 1 đến n */
		Scanner scan = new Scanner(System.in);
		int number;
		
		// Nhập số
		System.out.println("Nhập vào số tự nhiên: ");
		number = Integer.parseInt(scan.nextLine());
		
		System.out.println("Tổng các số nguyên tố từ 1 đến" + " " +number + ": " + "\n" + sumPrimeNumber(number));
	}
	
	public static int sumPrimeNumber(int num) {
		int sum = 0;
		for(int i=0; i<=num; i++) {
			if(isPrime(i)) {
				sum += i;
				System.out.println(i + " : " + sum);
			}
		}
		return sum;	
	}

	private static boolean isPrime(int n) {
		if(n==2) return true;
		if(n<2 || n%2 == 0) {
			return false;
		}
		for (int i = 3, limit = (int) Math.sqrt(n); i <= limit; i += 2) {
	          if (n % i == 0) {
	                return false;
	           }
	    }
	    return true;
		}
}
