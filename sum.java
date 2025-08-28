package javaclass;

import java.util.Scanner;

	public class sum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number, sum = 0;

	        while (true) {
	            System.out.print("Enter a number (negative to stop): ");
	            number = sc.nextInt();

	            if (number < 0) {  // stop when negative number entered
	                break;
	            }

	            sum += number;  // add only positive numbers
	        }

	        System.out.println("Sum of positive numbers: " + sum);
	        sc.close();
	    }
	}



