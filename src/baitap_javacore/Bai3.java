package baitap_javacore;

public class Bai3 {
	public static void main(String[] args) {
		/*
		 * show on the screen information about: . Java version . Java Runtime Version .
		 * Java Home . Java Vendor . Java Vendor URL . Java Class Path
		 */
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
	}
}
