package example30;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show the calculation of employee payroll
*/
public class Example30
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//ask Employee’s name
		System.out.print("Enter employee's name: ");
		String employeeName = in.nextLine();
		
		//ask Number of hours worked in a week
		System.out.print("Enter number of hours worked in a week: ");
		int hourOfWork = in.nextInt();
		
		//ask Hourly pay rate
		System.out.print("Enter hourly pay rate: ");
		double hourlyRate = in.nextDouble();
		
		//ask Federal tax withholding rate (as a decimal percentage)
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = in.nextDouble();

		//ask State tax withholding rate (as a decimal percentage)
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = in.nextDouble();
        System.out.println(" ");
		
		//math calculation
		final double regularHour = 40;
		final double overTimeRate = 1.50;
		double regularPay = (regularHour * hourlyRate);
		double overTimePay = (hourOfWork - regularHour) * (hourlyRate * overTimeRate);
		double grossPay = regularPay + overTimePay;
		double federalHold = grossPay * federalTaxRate;
		double stateHold = grossPay * stateTaxRate;
		double totalDeduct = federalHold + stateHold;
		double netPay = grossPay - totalDeduct;
		
		//All of the numeric inputs must be positive. If any input is negative, display an error message and end the program
		if (hourOfWork >= 0 && hourlyRate >= 0 && federalTaxRate >=0 && stateTaxRate >=0)
        {
			//Display the employee name
			System.out.println("Employee Name: " + employeeName);
			
			//display hours worked
			System.out.println("Hours Worked: " + hourOfWork);
			
			//Display pay rate
			System.out.println("Pay Rate: " + "$" + hourlyRate);
			
			//display regular pay
			System.out.format("Regular Pay: $%.2f\n", regularPay);
			
			//Display overtimepay
			System.out.println("Overtime Pay: " + "$" + (Math.round(overTimePay * 100) / 100.0));
			
			//display gross pay
			System.out.println("Gross Pay: " + "$" + grossPay);
			
			//show the deduction section
			System.out.println("Deductions: ");
			
			//ferderal withholding
			System.out.println("\tFederal Withholding (20.0%): " + "$" + (Math.round(federalHold * 100) / 100.0));
			
			//state withholding
			System.out.println("\tState Withholding (9.0%): " + "$" + (Math.round(stateHold * 100) / 100.0));
			
			//Total Deductions
			System.out.println("\tTotal Deduction: " + "$" + (Math.round(totalDeduct * 100) / 100.0));
			
			//net pay
			System.out.println("Net Pay: " + "$" + (Math.round(netPay * 100) / 100.0));
		}
		else 
		{
			System.out.println("error!");
		    System.exit(0);
		}
	} 
}
