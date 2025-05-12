package java_Task3_Programs;

public class Task3_Account_class 
{
	private String Cust_name;
	private int acc_num;
	private double balance;
	public double withdraw;
	public double deposit;
	
	public void Task3_Account_class()
	{
		this.Cust_name = "xxx";
		this.acc_num = 0;
		this.balance = 0.0;
		System.out.println("CUSTOMER DETAILS ARE GIVEN BELOW");
	}

	public void Task3_Account_class(String Cust_name, int acc_num)
	{
		this.Cust_name = Cust_name;
		this.acc_num = acc_num;
		this.balance = 1000.0;
		System.out.println("Initial balance is " + " " + balance);
	}

	public void deposit(int deposit)
	{
		System.out.println("Deposit amount is" + " " + deposit);
		this.balance = balance + deposit;
	}
	
	public void withdraw(int withdraw)
	{
		if(withdraw <= balance)
		{
		System.out.println("Sufficient balance to withdraw the given amount");
		}
			else
			{
				System.out.println("In-Sufficient balance to withdraw the given amount");
			}
		}
	
	
	public void Checkbalance()
	{
		System.out.println("Check balance of Customer account is" + " " + balance);
	}

	
	public static void main(String[] args) 
	{
		
		Task3_Account_class obj = new Task3_Account_class(); // Constructor with no arguments (giving invalid details) 
		obj.Task3_Account_class("Anitha",2345);             // Constructor with two arguments (giving valid input) 
		obj.deposit(4000);
		obj.withdraw(4000);
		obj.Checkbalance();
		 	
	}

}
