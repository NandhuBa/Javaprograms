package day10_Programs;

import java.util.Scanner;

public class Sum_Of_Numbers {

	int a = 50;
	int b = 30;
	
	public int add()
	{
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		Sum_Of_Numbers obj = new Sum_Of_Numbers();
	  System.out.println("The value of a is" + " ");
	  int s = obj.add();
	  System.out.println(s);
    }

}
