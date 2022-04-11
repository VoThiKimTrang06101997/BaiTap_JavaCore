package baitap_javacore;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args) {
		/* nhập vào số phần tử và từng phần tử của một mảng -> Xóa đi các phần tử bị lặp lại.
		 * */
		Scanner scan = new Scanner(System.in);
	    int number;
	    int arrayLength;
	    
	    System.out.print("Hãy nhập độ dài của mảng: ");
		arrayLength = Integer.parseInt(scan.nextLine());
		
	    ArrayList<Integer> arrListNumber = new ArrayList<>();
	         
	    for (int i = 0; i < arrayLength; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        number = scan.nextInt();
	        arrListNumber.add(number);
	    }
	         
	    // tạo 1 ArrayList arrTemp
	    ArrayList<Integer> arrTemp = new ArrayList<>();
	         
	    // thêm các phần tử của arrListNumber vào arrTemp
	    // nếu trong arrTemp đã tồn tại phần tử giống trong arrListNumber
	    // thì không thêm vào, ngược lại thêm bình thường
	    for (int i = 0; i < arrListNumber.size(); i++) {
	        if (!arrTemp.contains(arrListNumber.get(i))) {
	            arrTemp.add(arrListNumber.get(i));
	        }
	    }
	         
	    // xóa các phần tử của arrListNumber
	    arrListNumber.clear();
	         
	    // thêm tất cả các phần tử của arrTemp vào arrListNumber
	    // lúc này ta sẽ có 1 ArrayList arrListNumber
	    // không chứa các phần tử trùng nhau
	    arrListNumber.addAll(arrTemp);
	         
	    System.out.println("Các phần tử có trong arrListNumber là: ");
	    System.out.println(arrListNumber);
	}
}


