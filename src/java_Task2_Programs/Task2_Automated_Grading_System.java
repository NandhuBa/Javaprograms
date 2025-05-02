package java_Task2_Programs;

import java.util.Scanner;

public class Task2_Automated_Grading_System {
	
	public static void Grading_system(int mark)
	{
		int score = mark;
		if (score > 100)  
		{
			System.out.println("Invalid Input");
        } 
		else if (score == 100)
        {
			System.out.println("GRADE-S");
        } 
		else if ((score >= 90) && (score <=99))
        {
			System.out.println("GRADE-A");
        } 
		else if ((score >= 80) && (score <=89)) 
        {
			System.out.println("GRADE-B");
        } 
		else if ((score >= 70) && (score <=79))
        {
			System.out.println("GRADE-C");
        } 
		else if ((score >= 60) && (score <=69))
        {
			System.out.println("GRADE-D");
        } 
		else if ((score >= 50) && (score <=59))
        {
			System.out.println("GRADE-E");
        } 
		else 
        {
			System.out.println("GRADE-F");
        }
	}


	public static void main(String[] args) 
	{
		System.out.println("Student mark is"+ " ");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		Task2_Automated_Grading_System GS = new Task2_Automated_Grading_System();
		GS.Grading_system(mark);
		sc.close();
	}
     
}
