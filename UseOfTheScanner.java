package working;

import java.util.Scanner;

public class UseOfTheScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name =sc.nextLine();
System.out.println("User entered name: "+name+".");
sc.close();
	}

}
