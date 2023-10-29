package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Sortarray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a list of numbers separated by spaces (e.g., 12 10 6 2 1 6 11):");

        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];
        List<Integer> set = new ArrayList<Integer>();

        for (int i = 0; i < inputArray.length; i++) {
            try {
                arr[i] = Integer.parseInt(inputArray[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers separated by spaces.");
                return;
            }
        }
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        for (int num : arr) {
            set1.add(num);
        }

        // Print the sorted and deduplicated numbers with "*" in between
        for (int num : set1) {
            System.out.print(num);
            System.out.print(" * ");
        }
        
        for (int i = 0; i < arr.length; i++)
        {
        	set.add(arr[i]);
        }
        System.out.println(set);

        // Print the sorted array with "*" in between the elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.println("");
            }
        }

        scanner.close();
	}
}
