package day13_Programs;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	
	{
		System.out.println("Start of the Program");
		int[] arr= {10,20,30,40};
		Scanner sc= new Scanner(System.in);
	
		int i = sc.nextInt();
		
		
		try {
			//String str = null;
			//System.out.println(str.length());
			//System.exit(0);
			System.out.println(arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry you entered a wrong index");
		}
		/*catch(NullPointerException e) {
			System.out.println("String cannot be null");
		*/
	
		finally 
		{
			System.out.println("End of the program");
		} 
    }
    }
