package Revision;

import java.util.Scanner;

public class DisplayName {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = "Khanh";
		String[] yes = name.split(""); 
		int n = name.length();

		for (int i = 1; i <= n; i++) {

		for (int space = n - i; space >= 1; space--) {

		System.out.print(" ");

		}

		for (int j = 0; j < i; j++) {

		System.out.print(yes[j]+ " ");

		}

		System.out.println();

		}

		sc.close();

		}
		}
		
	

