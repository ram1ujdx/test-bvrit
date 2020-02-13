package com.capg.demo;

import java.time.LocalDate;
import java.util.Scanner;

public class TestLeapYear {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		for(int num=1;num<20;num++) {
		
		if((num | 1) == num) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
		}
		
		
		
		LocalDate date = LocalDate.now();
		
		

	}
}
