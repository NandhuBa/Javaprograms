package day10_Programs;

public class Types_of_variables_and_methods 
{
     int a=20;
     int b=3;
     
     public int print()
     {
    	 int c = a - b;
    	 return c;
    	 
     }
	
	public static void main(String[] args) 
	
	{
		Types_of_variables_and_methods obj = new Types_of_variables_and_methods();
		int S = obj.print();
		System.out.println("The value is" + " "+ S);
	}

}
