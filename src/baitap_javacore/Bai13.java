package baitap_javacore;

import java.util.Scanner;

public class Bai13 {
	public static void main(String[] args) {
		/*
		 * Enter the length of an array: Nhập vào số lượng phần tử mảng.
		 * Enter each element of the array : Nhập vào từng phần tử của mảng.
		 * a. an average of elements: Giá trị trung bình.
		 * b. max and min: phần tử lớn nhất, nhỏ nhất.
		 * c. negative max and min: phần tử âm lớn nhất, nhỏ nhất trong mảng.
		 * d. positive max and min: phần tử dương lớn nhất, nhỏ nhất trong mảng.
		 * e. show even and odd elements: In ra các phần tử chẵn, lẻ.
		 * f. add a member: Thêm một phần tử theo index. 
		 * g. remove a member: Xóa một phần tử theo index.
		 */
		Scanner scan = new Scanner(System.in);
		
		int arrayLength;
		int[] array;
		boolean loop = true;
		char option;

		System.out.print("Enter the length of an array: ");
		arrayLength = Integer.parseInt(scan.nextLine());
		
		// Nhập các số vào mảng
		array = new int[arrayLength]; 
		System.out.println("Enter each element of the array: ");
		for(int i=0; i< array.length; i++) {
			System.out.printf("a[%d] = ", i);
			array[i] = Integer.parseInt(scan.nextLine());
		}
		
		showElementArray(array);

		do {
			option = showMenu(scan);
			loop = processMenu(option, array, scan);

			// stop the screen for viewing the result
			scan.nextLine();
		} while (loop);
		
	}

	private static void showElementArray(int[] array) {
		System.out.print("All elements of the array: ");

		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println();
	}


	private static boolean processMenu(char option, int[] array, Scanner scan) {
		// to serve for options which require template value
		int tempValue;

		switch (option) {
		case 'a':// calculate an average value of all elements in array
			System.out.println("Result: " + calculateAverage(array));
			break;
		case 'b':// find out max and min
			System.out.println("The greatest value: " + findMax(array));
			System.out.println("The least value: " + findMin(array));
			break;
		case 'c':// find out negative max and min
			int[] negativeArray = takeOutNegativeElements(array);

			if (negativeArray == null)
				System.out.println("There is no positive elements.");

			if (negativeArray != null) {
				System.out.println("The greatest positive value: " + findMax(negativeArray));
				System.out.println("The least positive value: " + findMin(negativeArray));
			}
			break;
		case 'd':// find out positive max and min
			int[] positiveArray = takeOutPositiveElements(array);

			if (positiveArray == null)
				System.out.println("There is no positive elements.");

			if (positiveArray != null) {
				System.out.println("The greatest positive value: " + findMax(positiveArray));
				System.out.println("The least positive value: " + findMin(positiveArray));
			}
			break;
		case 'e':// show even and odd elements
			int[] evenArray = takeOutEvenElements(array);
			int[] oddArray = takeOutOddElements(array);
			
			if(evenArray == null)
				System.out.println("There is no even element.");
			if(evenArray != null)
				System.out.println("Even Array: ");
				showElementArray(evenArray);
				
			if(oddArray == null)
				System.out.println("There is no odd element.");
			if(oddArray != null)
				System.out.println("Odd Array: ");
				showElementArray(oddArray);
			break;
		case 'f':// add an element
			System.out.print("Enter a value: ");
			tempValue = Integer.parseInt(scan.nextLine());

			array = addElement(array, tempValue);
			showElementArray(array);
			break;
		case 'g':// remove an element
			System.out.print("Enter a value: ");
			tempValue = Integer.parseInt(scan.nextLine());

			// in cases of tempValue does not exist in the array, keep the array retained
			if (removeElement(array, tempValue) != null)
				array = removeElement(array, tempValue);

			showElementArray(array);
			break;
		case 'h':// exit menu
			System.out.println("The program is closing....");
			break;
		default:
			System.out.println("Invalid option! PLease try again.");
			break;
		}
		return true;
	}

	private static int[] takeOutOddElements(int[] array) {
		// catch an event when array does not contain any odd element
		if (countOddElements(array) == 0)
			return null;

		int[] oddArray = new int[countOddElements(array)];

		int i = 0;
		for (int j : array) {
			if (j % 2 != 0) {
				oddArray[i] = j;
				i++;
			}
		}

		return oddArray;
	}

	private static int countOddElements(int[] array) {
		int count = 0;

		for (int i : array) {
			if (i % 2 != 0)
				count++;
		}
		return count;
	}

	private static int[] takeOutEvenElements(int[] array) {
		// catch an event when array does not contain any even element
		if (countEvenElements(array) == 0)
			return null;

		int[] evenArray = new int[countEvenElements(array)];

		int i = 0;
		for (int j : array) {
			if (j % 2 == 0) {
				evenArray[i] = j;
				i++;
			}
		}

		return evenArray;
	}

	private static int countEvenElements(int[] array) {
		int count = 0;

		for (int i : array) {
			if (i % 2 == 0)
				count++;
		}
		return count;
	}

	private static int[] takeOutNegativeElements(int[] array) {
		// catch an event when array does not contain any negative element
		if (countNegativeElements(array) == 0)
			return null;

		int[] negativeArray = new int[countNegativeElements(array)];

		int i = 0;
		for (int j : array) {
			if (j < 0) {
				negativeArray[i] = j;
				i++;
			}
		}

		return negativeArray;
	}

	private static int countNegativeElements(int[] array) {
		int count = 0;

		for (int i : array) {
			if (i < 0)
				count++;
		}
		return count;
	}

	private static int[] takeOutPositiveElements(int[] array) {
		// catch an event when array does not contain any positive element
		if (countPositiveElements(array) == 0)
			return null;

		int[] positiveArray = new int[countPositiveElements(array)];

		int i = 0;
		for (int j : array) {
			if (j > 0) {
				positiveArray[i] = j;
				i++;
			}
		}

		return positiveArray;
	}

	private static int countPositiveElements(int[] array) {
		int count = 0;

		for (int i : array) {
			if (i > 0)
				count++;
		}
		return count;
	}

	private static int[] removeElement(int[] array, int tempValue) {
		// catch an event when tempValue does not exist in the array
		if (!existValue(array, tempValue))
			return null;

		int[] tempArray = new int[array.length - 1];
		// just remove the first element in terms of duplicate value
		boolean removeFirstElement = true;

		for (int i = 0, k = 0; i < array.length; i++) {
			if (array[i] == tempValue && removeFirstElement) {
				removeFirstElement = false;
				continue;
			}

			tempArray[k++] = array[i];
		}

		return tempArray;
	}

	private static boolean existValue(int[] array, int tempArray) {
		for (int i : array) {
			if (i == tempArray)
				return true;
		}
		return false;
	}

	private static int[] addElement(int[] array, int value) {
		int[] tempArray = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		tempArray[tempArray.length - 1] = value;

		return tempArray;
	}

	private static int findMin(int[] array) {
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}

	private static int findMax(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}

		return max;
	}

	private static float calculateAverage(int[] array) {
		int sum = 0;
		int count = 0;

		for (int i : array) {
			sum += i;
			count++;
		}

		return sum / count;
	}

	private static char showMenu(Scanner scan) {

		System.out.println("------------Welcome------------");
		System.out.println("-------------------------------");
		System.out.println("(a). An average of elements");
		System.out.println("(b). Max and min");
		System.out.println("(c). Negative max and min");
		System.out.println("(d). Positive max and min");
		System.out.println("(e). Show even and odd elements");
		System.out.println("(f). Add a member");
		System.out.println("(g). Remove a member");
		System.out.println("(h). End");
		System.out.println("-------------------------------");
		System.out.print("Please enter an option: ");

		return scan.nextLine().charAt(0);
	}

}
