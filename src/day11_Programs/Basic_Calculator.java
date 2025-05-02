package day11_Programs;

public class Basic_Calculator {

	 int num1;
	int num2;
	 int result;
	
	public void addition(int num1, int num2)
	{
		this.num1=num1;  //this keyword is used only during parameter passing. just distinguish between instance variables and parameters with the same name, to call one constructor from another of the same class, or to return the current object.
		this.num2=num2;
		result = num1 + num2;
		System.out.println("The addition of two numbers is"+ " "+ result);
	}

	public void subtraction(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		result = num1 - num2;
		System.out.println("The subtraction of two numbers is"+ " "+ result);
	}
	
	public static void main(String[] args) 
	{
		Basic_Calculator obj = new Basic_Calculator();
		obj.addition(10,30); 
		obj.subtraction(96, 6);
	}

}
