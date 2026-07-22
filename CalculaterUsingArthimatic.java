package working.Java_projects;

import java.util.Scanner;


public class CalculaterUsingArthimatic {

	public static void main(String[] args) {
	
Scanner sc =new Scanner(System.in);
System.out.println("Enter input 1 ");
int input1 = sc.nextInt();
System.out.println("Enter the Arhimatic operation : ");
String arthimatic = sc.next();
System.out.println("Enter the input 2 : ");
int input2 = sc.nextInt();
{if(arthimatic.equals("+"))
{
	int addtion = input1+ input2;
	System.out.println("Addtion operation you have perfromed Result : "+addtion);
}
else 
{
	if(arthimatic.equals("-"))
	{
		int substraction = input1 - input2;
		System.out.println("Substraction operation you have perfromed Result : "+substraction);
	}
	else
	{
		if(arthimatic.equals("*")) {
			int multiplication = input1 * input2;
			System.out.println("Multiplication operation you have Result : "+multiplication);
		}
		else
		{
			if(arthimatic.equals("/") )
			{
				int division = input1 + input2;
				System.out.println("Division operation you have performed Result : "+division);
			}
			else
			{
				if(arthimatic.equals("%"))
				{
					int reminder = input1 % input2;
					System.out.println("Reminder operation you have performed Result : "+reminder);
				}
				else
				{
					System.out.println("Entered the invalid operation please try again");
				}
			}
		}
	}
}
	
}
	}

}
