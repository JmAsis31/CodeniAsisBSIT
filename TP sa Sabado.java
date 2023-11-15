import java.util.*;
public class Main {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Created by: JmAsis (0_0)");
		System.out.println("");
		System.out.println("_____________________________");
		System.out.println("");
		
		System.out.print("Enter employee name: ");
		String NAME = sc.nextLine();
		
		System.out.print("Press F for Full time or P for Part time: ");
		String UI = sc.nextLine();
		
		if (UI.equalsIgnoreCase("P"))
		{
			System.out.println("--- Part Time ---");
			System.out.print("Enter Rate per Hour: ");
			double RPH = sc.nextDouble();
			System.out.print("Enter Num. of Hours worked: ");
			double NHW = sc.nextDouble();
			System.out.print("Enter Num. of Overtime: ");
			double NO = sc.nextDouble();
			
			double BP = RPH * NHW;
			double WAGE = NO * (RPH * 1.25);
			double GP = BP + WAGE;
			System.out.println("--------------------");
			System.out.println("Employee Name: " + NAME);
			System.out.println("Basic Pay: " + BP);
			System.out.println("Overtime Pay: " + WAGE);
			System.out.println("--------------------");
			System.out.println("Gross Pay: " + GP);
		}
		else if (UI.equalsIgnoreCase("F"))
		{
			System.out.println("--- Full Time ---");
			System.out.print("Enter Basic Pay: ");
			double BP = sc.nextDouble();
			System.out.println("--------------------");
			System.out.println("Employee Name: " + NAME);
			System.out.println("Basic Pay: " + BP);
			System.out.println("--------------------");
			System.out.print("Gross Pay: " + BP);
			
		}
		else {System.out.print("Invalid Input. Please enter 'P' or 'F'");}
	}
}