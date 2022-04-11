package baitap_javacore;

import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		/* Chương trình giải phương trình bậc 1 và bậc 2. Trình bày dưới dạng menu cho phép lựa chọn*/
		Scanner input = new Scanner(System.in);
		int luaChon = 0;
		
		System.out.println("Giải phương trình");
		System.out.print("\n1.PT bậc 1 \n2.PT bậc 2");
		System.out.print("\nLựa chọn của bạn: ");
		luaChon = Integer.parseInt(input.nextLine());
		
		switch(luaChon) {
		case 1: PTBac1();
				break;
		case 2: PTBac2();
				break;
		default: 
			System.out.println("Nhập 1 hoặc 2");
			break;
		}
	}
	
	private static void PTBac1() {
		Scanner input = new Scanner(System.in);
		double a=1, b=0, x;
		boolean phuongTrinh = true;
		
		System.out.println("Phương trình bậc 1: aX+ b = 0");
		System.out.println("Nhập a: ");
		a = Double.parseDouble(input.nextLine());
		System.out.println("Nhập b: ");
		b = Double.parseDouble(input.nextLine());
		if(phuongTrinh && a==0 && b==0) {
			System.out.println("Phương trình vô số nghiệm");
			phuongTrinh = false;
		}
		if(phuongTrinh && a==0 && b!=0) {
			System.out.println("Phương trình vô nghiệm");
			phuongTrinh = false;
		}
		if(a!=0) {
			x = -b/a;
			System.out.println("Nghiệm của phương trình là: " + x);
			phuongTrinh = false;
		}
	}
	
	private static void PTBac2() {
		Scanner input = new Scanner(System.in);
		
		double a, b, c, x, x1, x2;
		System.out.println("Phương trình bậc 1: aX^2 + bX + c = 0 ");
		System.out.print("Nhập a: ");
		a = Double.parseDouble(input.nextLine());
		System.out.print("Nhập b: ");
		b = Double.parseDouble(input.nextLine());
		System.out.print("Nhập c: ");
		c = Double.parseDouble(input.nextLine());
		
		 // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        }
        // tính delta
        double delta = b*b - 4*a*c;
        // tính nghiệm
        
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        }  else {
            System.out.println("Phương trình vô nghiệm!");
        }
	}	
}


	
