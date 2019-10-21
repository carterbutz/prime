
	//Objective: To find the prime numbers between 1-100 

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args);
	Scanner scan = new Scanner(System.in);
	//prompt
	System.out.print("The prime numbers between 1 and 100 are: ");
	//initialize
	int count = 0;

	//For loop for prime numbers
	for (int i = 2; i <= 100; i++) {
		if (isPrime(i)) {
			count += 1;
			System.out.print(i + " ");
			}
		}
		System.out.printf("There are %d prime numbers.", count);
	}
	//using new boolean user-defined method given
	public static boolean isPrime(int num) {
		//if statement with logical operator
		if (num == 2 || num == 3) {
			return true;
	}
	if (num % 2 == 0 || num % 3 == 0) {
		return false;
	}

	//for loop/if statement
	for (int i = 3; i < Math.sqrt(num); i += 2) {
		if (num % i == 0 || num % Math.sqrt(num) == 0){
			return false;
		}
	}
			return true;
		}
	}