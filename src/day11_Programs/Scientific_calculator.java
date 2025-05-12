package day11_Programs;

public class Scientific_calculator extends Basic_Calculator {

	int num1;
	int num2;
	int result;
	
	public void tan() 
	{
		
		System.out.println("This is tan method ");
	}
	
	
	public void cos() 	
	{
			
		System.out.println("This is cos method ");
	}

		
	public static void main(String[] args) 
	{

		Scientific_calculator obj = new Scientific_calculator();
				obj.addition(10, 20);
				obj.subtraction(20, 10);
				obj.tan();
				obj.cos();

	}

}
