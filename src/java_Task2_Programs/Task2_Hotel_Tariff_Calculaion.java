package java_Task2_Programs;

import java.util.Scanner;

public class Task2_Hotel_Tariff_Calculaion {

	public static void main(String[] args) 
	{
		float Normaltariff=0; 
		double Peaktariff=0;
		
		System.out.println("The month is"+ " ");
		Scanner sa=new Scanner(System.in);
		int month = sa.nextInt();
		
		System.out.println("The rent is"+ " ");
		Scanner sb = new Scanner(System.in);
		float rent = sb.nextInt();
		
		System.out.println("Number of days"+ " ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		Normaltariff = rent * n;
		Peaktariff = ((rent+(rent*0.2))* n);
		
		switch(month)
		  {
		  case 1,2,3:    System.out.println("Total Tarrif amount is "+ " "+ Normaltariff);
		                 break;
		              
		  case 4,5,6:    System.out.println("Total Tarrif amount is "+ " "+ Peaktariff);
                         break;  
                      
		  case 7,8,9,10: System.out.println("Total Tarrif amount is "+ " "+ Normaltariff);
                         break;
                         
		  case 11,12:    System.out.println("Total Tarrif amount is "+ " "+ Peaktariff);
                         break; 
                         
          default:       System.out.println(" Invalid Input ");
                         break;
                               
		  }
          sa.close();
          sb.close();
          sc.close();
	}

}
