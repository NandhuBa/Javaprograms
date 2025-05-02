package day11_Programs;

public class Inter_calculator extends Basic_Calculator {
	
	static int num1;
	static int num2;
	static int result;

	public void addition(int num1, int num2) //When same method with same parameter, same name and same return type is defined in both parent & child class, then the method in the child class is only called but not the methods in parent class
	{
		this.num1= num1;
		this.num2= num2;
		result = num1 + num2 + 1;
		System.out.println("The addition result is" + " " + result);	
	}

	public void mul(int num1, int num2)
	{
		this.num1= num1;
		this.num2= num2;
		result = num1 * num2;
		System.out.println("The multiplication result is" + " " + result);	
	}
	
	public void addition(int num1, int num2, int num3)
	{
		this.num1= num1;
		this.num2= num2;
		result = num1 + num2 + num3;
		System.out.println("The addition result is" + " " + result);	
	}
	
	public static void main(String[] args) 
	{
		Inter_calculator obj = new Inter_calculator();
		obj.addition(15,15);  // overriding now 
		obj.subtraction(50,25);
		obj.addition(15, 1, 2);
		obj.mul(2, 30);
	}

}
