package com.bl.stackqueue;

import java.util.Scanner;

public class StackQueqeMain {
	public static void main(String[] args) {
		System.out.println("Welcome on the data Structure in 'Stack and Queqe' Program!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press '1' to add element at the start  ");
		switch (sc.nextInt()) {
		case 1:
			Operation.addElement();
			break;
		default: {
			System.out.println("Press Valid Key");
		
		   }
		}
	}
}
