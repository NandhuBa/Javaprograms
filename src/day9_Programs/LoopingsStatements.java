package day9_Programs;

public class LoopingsStatements {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(++a);
		System.out.println("a value is " + --a);
		
		//print "Hello world  times"
		System.out.println("Printing Hello world 5 times");
		
		for (int i=0; i<=5; i++)
		{
			System.out.println("Hello world");
		}
		
		System.out.println("End of the program");
		
		
		//Print numbers from 1 to 10
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(i+ ""); // or System.out.println(i);
		}
		
		System.out.println("Print numbers from 10 to 1");
		
		for (int i=10; i>0; i--)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		
		//printing 1 to 5 in 5 rows 
		
		int n=5;
		
		for (int i=1; i<=n; i++)   // i loop is for iteration (or) to print number of rows
		{
			for (int j=1; j<=n; j++) //j loop is for printing values (or) to print number of columns
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
			
		// PRINT 1 TO 10 BUT SKIP 5
		
		for(int i=1; i<=10; i++)
		{
			
				if (i == 5)
				{
				continue;      //skip the iteration
				}
				
				if (i == 7)
				{
				break;         //end of loop
				} 
				System.out.println(i);
				
		}	
				
				//While statement
				
				System.out.println("While statement");
				
				int i=1;
				while(i<=10)
				{
				System.out.println(i);
				i++;
				}
				
				System.out.println();
// Do While statement
				
				System.out.println("Do-While statement");
				
			int j=1;
				do{
				System.out.println(j);
				j++;
				}while(j<=10);
		}
	}
		
	

