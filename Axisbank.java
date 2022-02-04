package week3.day1;

public class Axisbank {


			public void deposit()
	{
		System.out.println("This is AxisBankInfo Class deposit.");
	}

	public static void main(String[] args) 
	{
		Axisbank bnk = new Axisbank();
		// This AxisBank information class deposit method Overrides BankInfo class deposit method in bankl. 
		bnk.deposit();
	}
	}
