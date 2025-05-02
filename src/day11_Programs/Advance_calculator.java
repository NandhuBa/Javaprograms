package day11_Programs;

public class Advance_calculator extends Inter_calculator {
   
	static int num1;
	static int num2;
	static int result;

	public void div (int num1, int num2)
	{
		this.num1= num1;
		this.num2= num2;
		result = num1 / num2;
		System.out.println("The division result is" + " " + result);	
	}

	public int mod(int num1, int num2)
	{
		this.num1= num1;
		this.num2= num2;
		result = num1 % num2;
		return (result);
	}
	
	
	public static void main(String[] args) 
	{
		Advance_calculator obj = new Advance_calculator();
	    obj.addition(3, 2);
	    obj.mul(5, 6);
	    obj.addition(9, 8, 7);
	    obj.subtraction(60, 45);
	    obj.div(50, 25);
	    int m = obj.mod(60, 2);
	    System.out.println("The modulus result is" + " " + m);
	}


}
