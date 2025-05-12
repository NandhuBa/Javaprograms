package day9_Programs;

public class DecisionMakingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Check voting eligibility
		
		int age = 20;
		boolean voterid = true;
		boolean votingslip = true;
		
		// Simple-if
		System.out.println("----Simple-if----");
		
		if (age >=18)
		{
		
          System.out.println("Eligible to vote");
		}
		
		
		
		// If-else
		System.out.println("----if-else----");
		
		if (age>=18)
		{
			System.out.println("Eligible to vote");
		}
		
		else {
			System.out.println("Not Eligible to vote");
		}
		System.out.println();
		
		
		
		
		
		
		if( voterid == true && votingslip == true)     //Logical operator
		{
			
			System.out.println("Eligible to vote");
			
	     } else {
		
		System.out.println("Oops!! Sorry you are not eligible to vote");
	     }
		
		
		
		// if-else-if ladder
		
		System.out.println("---if-else-if ladder----");
		if(voterid == true)
		{
			System.out.println("Person has voterid, Eligible to vote");
			}
		else if (votingslip == true)
		{
			System.out.println("Person has votingslip, Eligible to vote");
		}
		else
		{ 
			System.out.println("Person has neither voterid and votingslip, so not eligible to vote");
		}
		System.out.println();
		
		
		
		
		// Nested-if Statement
		
          if(age >=18 ) 
          {
			if(voterid==true || votingslip==true) 
			{
				System.out.println("Eligible to vote");
			} else {
				
				System.out.println("Voter id or voting slip is required");
			}
			
		} else 
		{
			System.out.println("Sorry, you are under age!!");
		}
		
		System.out.println("End of program");
		
		
		
		
		
		//switch case
		
		int num = 7;
		switch (num)
		{
		case 0 : System.out.println("Sunday");
		         break;
		           
		case 1 : System.out.println("monday");
        break;
		        
		case 2 : System.out.println("Tuesday");
        break;
        
		case 3 : System.out.println("wednesday");
        break;
        
		case 4,5,6,7 : System.out.println("Thursday");
        break;
        
		case 8 : System.out.println("Friday");
        break;
        
		case 9 : System.out.println("Saturday");
        break;
        
        default: System.out.println("Invalid input");
       
		}
		
		
		}
       }
