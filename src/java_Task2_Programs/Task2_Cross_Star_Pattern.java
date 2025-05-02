package java_Task2_Programs;

import java.util.Scanner;

public class Task2_Cross_Star_Pattern {

	public static void main(String[] args) 
	{
		System.out.println("The Input sample is:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
