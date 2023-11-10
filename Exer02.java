package com.igor.cursojava.aula04;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		int num, contPares = 0, contImpares = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("\nDigite o " + i + "° número: ");// 2
			num = scan.nextInt();
			if (num % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}
		}
		System.out.println("\nTotal de números pares: " + contPares);
		System.out.println("\nTotal de números ímpares: " + contImpares);

	}

}
